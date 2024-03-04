package com.employee.dao;

import java.sql.*;
import java.sql.SQLException;
import static com.employee.utils.DBUtils.openConnection;

public class AccountDaoImpl implements IAccountDao {
	
	//add data members
	private Connection cn;
	private CallableStatement cst1;
	
	//add ctr
	public AccountDaoImpl() throws SQLException {
		// get DB connection
		cn = openConnection();
		//cst1 to represent invocation of stored procedure
		cst1 = cn.prepareCall("{call transfer_funds(?,?,?,?,?)}");
		
		//register out parameter
		//API of CST public void registerOutParameter(int paramPos, int jdbcType) throws SQLException
		cst1.registerOutParameter(4, Types.DOUBLE);
		cst1.registerOutParameter(5, Types.DOUBLE);
		System.out.println("Account Dao created!!");
	}
	

	@Override
	public String transferFunds(int srcAccId, int destAccId, double amount) throws SQLException {
		cst1.setInt(1, srcAccId);
		cst1.setInt(2, destAccId);
		cst1.setDouble(3, amount);
		//execute stored procedure
		cst1.execute();
		return "Updated src acc balance"+cst1.getDouble(4)+"dest acc balance"+cst1.getDouble(5);
	}
	
	public void cleanUp() throws SQLException{
		if(cst1 != null)
			cst1.close();
		if(cn != null)
			cn.close();
		System.out.println("Account Dao cleaned up!!");
	}

}

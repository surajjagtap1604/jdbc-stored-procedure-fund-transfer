package com.employee.dao;

import java.sql.SQLException;

public interface IAccountDao {

	// add a method to transfer funds from source acc to destination acc
	String transferFunds(int srcAccId, int destAccId, double amount) throws SQLException;

}

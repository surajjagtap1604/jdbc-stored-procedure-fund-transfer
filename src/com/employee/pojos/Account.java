package com.employee.pojos;

public class Account {
	// id | name  | acc_type | balance
	private int accId;
	private String customerName;
	private String accType;
	private double balance;
	
	//default ctr
	public Account() {
	
	}
	
	//getters setters
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//toString
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", customerName=" + customerName + ", accType=" + accType + ", balance="
				+ balance + "]";
	}
	
	
	
	

}

package com.employee.tester;

import java.util.Scanner;

import com.employee.dao.AccountDaoImpl;

public class TestStoredProc {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// create Dao instance
			AccountDaoImpl dao = new AccountDaoImpl();
			System.out.println("Enter srcAccID destAccId amount");
			System.out.println(dao.transferFunds(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
			dao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

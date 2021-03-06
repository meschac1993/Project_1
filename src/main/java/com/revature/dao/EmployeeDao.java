package com.revature.dao;

import com.revature.beans.Employee;

public interface EmployeeDao {

	public abstract int getUserID(String username);
	public abstract int checkAthority(int id); 
	public abstract double getRemainingBalance(int id);
	public abstract String getDepartmentName(int id);
	public abstract Employee getUser(int id);
	public abstract void updateRemainingBalance(int id, double bal);
	public abstract String authenticate(String username); // returns password for username or null for user not found
}

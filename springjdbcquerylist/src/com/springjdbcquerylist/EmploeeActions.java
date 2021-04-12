package com.springjdbcquerylist;

public class EmploeeActions {

	private EmployeeDAO dao;
	public void insert(Employee e) {
		int x=dao.insertEmployee(e);
		System.out.println(x+ "row inserted");
	}
	
	public void selectAll() {
		dao.listAllEmployees();
	}
	public void modify(int eno,int sal) {
		int x=dao.updateEmployee(eno, sal);
		System.out.println(x+" row updated");
	}
}

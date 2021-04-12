package com.springjdbcquerylist;

public interface EmployeeDAO {
	int insertEmployee(Employee e);
	void listAllEmployees();
	int updateEmployee(int eno,double sal);

}

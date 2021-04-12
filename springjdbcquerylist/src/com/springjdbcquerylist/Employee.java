package com.springjdbcquerylist;

public class Employee {
	private int empId;
	private String ename;
	private int sal;
	private int deptno;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	

}

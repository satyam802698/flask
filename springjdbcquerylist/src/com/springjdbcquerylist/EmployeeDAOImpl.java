package com.springjdbcquerylist;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private JdbcTemplate jt;
	
	
	
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		int eno=e.getEmpId();
		String ename=e.getEname();
		int sal=e.getSal();
		int dno=e.getDeptno();
		
		Object params[]= {eno,ename,sal,dno};
		
		int k=jt.update("insert into employee values(?,?,?,?)", params);
				
		return k;
	}

	@Override
	public void listAllEmployees() {
		// TODO Auto-generated method stub
		List l=jt.queryForList("select * fro employee");

		Iterator<Employee> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	@Override
	public int updateEmployee(int eno, double sal) {
		// TODO Auto-generated method stub
		
		Object params[]= {sal,eno};
		int k=jt.update("update emp set sal=? where eno=?", params);
		return 0;
	}

}

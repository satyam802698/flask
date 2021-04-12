package com.astra.student;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;


public class Student {
private JdbcTemplate jt;




public void setDs(JdbcTemplate jt) {
	this.jt=jt;
}
public void createTable() throws DataAccessException{
    jt.execute("create table Student1(sno number,sname varchar2(20))");
    System.out.println("table created...");
}

public void insertRow() throws DataAccessException{
  int k= jt.update("insert into student1 values(111,'raghu')");
    System.out.println(k+"row(s) inserted..");
}

}

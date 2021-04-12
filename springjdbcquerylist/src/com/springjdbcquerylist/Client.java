package com.springjdbcquerylist;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		//Resource res=new ClassPathResource("EmployeeConfig.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("emp");
		System.out.println("sucess");
	}

}

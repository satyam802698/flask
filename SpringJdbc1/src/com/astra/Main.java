package com.astra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.astra.student.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("id1");
		
		Sample s=(Sample)obj;
		s.add();
		
		Student stu=(Student)factory.getBean("stu");
		stu.createTable();
		stu.insertRow();

	}

}

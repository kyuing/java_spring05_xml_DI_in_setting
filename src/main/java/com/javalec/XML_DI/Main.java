package com.javalec.XML_DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);	//container
		
		Student student1 = ctx.getBean("student1", Student.class);	//student 1
		System.out.println("Student 1__________________________________");
		System.out.println("name: " + student1.getName());
		System.out.println("hobbies: " + student1.getHobbies());
		
		/*
		 Apparently, we have the instance student2 
		 But, the object studentInfo has the ID "studentInfo1" 
		 which means, student2 functions as it does, but it instantiates student1 with the reference "studentInfo1" in applicationCTX1.xml 
		 student2 gets bean "studentInfo1" which is named student2 in the main but is the same as student 1 in value.		 
		 */
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2 = studentInfo.getStudent();	//student2 technically, but student1 == student2
		System.out.println("\nStudent 2__________________________________");
		System.out.println("name: " + student2.getName());
		System.out.println("hobbies: " + student2.getHobbies());
		
		//check to see if student1 == student2
		if (student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
		
		Student student3 = ctx.getBean("student3", Student.class);	//student3
		System.out.println("\nStudent 3__________________________________");
		System.out.println("name: " + student3.getName());
		if (student1.equals(student3)) {
			System.out.println("student1 == student3");
			
		}else {
			System.out.println("student1 != student3");
		}
		
		Family family = ctx.getBean("family", Family.class);	//family
		System.out.println("\nFamily__________________________________");
		System.out.println("father's name: " + family.getFatherName());
		System.out.println("mother's name: " + family.getMotherName());
		System.out.println("sister's name: " + family.getSisterName());
		System.out.println("bro's name: " + family.getBrotherName()); //Or, System.out.println(family.brotherName); 
		
		ctx.close();
	}	

}

package com.lti.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;


import com.lti.model.Course;
import com.lti.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	StudentDao studentDao=new InMemoryStudentDaoImpl();
		StudentDao studentDao=new PersistentStudentDaoImpl();
		boolean flag=true;
		do {
			System.out.println("1.Add a Student\t2.Update a Student"
					+ "\t3.Remove a Student\n4.Search a Student\t5.View All Student\t6.Enroll"
					+ "\n7.View Enroll");
			int ch = scanner.nextInt();
			int id,cid;
			String name;
			String date;
			DateTimeFormatter formatter;
			LocalDate dateOfBirth;
			Student student;
			boolean result;
			switch (ch) {
			case 1:
				//System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
				//id=scanner.nextInt();
				System.out.println("Enter your name,date of birth(dd/MM/yyyy)");
				name=scanner.next();
				date=scanner.next();
				formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dateOfBirth=LocalDate.parse(date, formatter);
				//student=new Student(id,name,dateOfBirth);
				student=new Student();
				student.setName(name);
				student.setDateOfBirth(dateOfBirth);
				result= studentDao.addStudent(student);
				if(result)
					System.out.println("Congratulation your registration is confirmed");
				else
					System.out.println("your registration Failed");
				break;
			case 2:
				System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
				id=scanner.nextInt();
				name=scanner.next();
				date=scanner.next();
				formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dateOfBirth=LocalDate.parse(date, formatter);
				student=new Student(id,name,dateOfBirth);
				studentDao.updateStudent(student);
				break;
			case 3:
				System.out.println("Enter your Student id");
				id=scanner.nextInt();
				studentDao.removeStudent(id);
				break;
			case 4:
				System.out.println("Enter your Student id");
				id=scanner.nextInt();
				try {
					student=studentDao.findAStudent(id);
					System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth());
				} catch (NullPointerException e) {
					System.out.println(e.toString());
				} 
				break;
			case 5:
				List<Student> students=studentDao.viewAllStudents();
				if(students.isEmpty())
				{
					System.out.println("No Student record found");
				}
				else
				{
					for(Student st:students) {
						System.out.println(st.getId() + " " + st.getName() + " " + st.getDateOfBirth()); 
					}
				}
				
				break;
				
			case 6:
				System.out.println("Enter Student Id and Course Id ");
				id=scanner.nextInt();
				cid=scanner.nextInt();
				studentDao.enroll(id, cid);
				break;

			case 7:
				Set<Entry<Student,Course>> enrollments=studentDao.viewEnrollment();
				Iterator<Entry<Student,Course>> allEnrollments=enrollments.iterator();
				while(allEnrollments.hasNext())
				{
					Entry<Student,Course> enrollment=allEnrollments.next();
					Student st=enrollment.getKey();
					Course cr=enrollment.getValue();
					System.out.println(st.getId() + " " + st.getName() + " " + st.getDateOfBirth()+" "+cr.getId()+" " +cr.getName());
				}
				
				break;
			
			default:
				flag=false;
				break;
			}
		} while (flag);
	}

}

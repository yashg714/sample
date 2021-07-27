package com.lti.main;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DegreeLevel;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;
import com.lti.model.Type;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// App.scenario1();
		// App.scenario2();
		// App.scenario3();
		//App.scenario4();
		App.scenario9();
	}

	public static void scenario1() {

		String[] sPhoneNumber2 = { "9755235201", "8759664327" };

		String[] sPhoneNumber3 = { "9122552201", "84254651326" };
		Student student = new Student();
		Student student2 = new Student(101, "John", LocalDate.now(), sPhoneNumber2);
		Student student3 = new Student(102, "nick", LocalDate.of(2021, 5, 26), sPhoneNumber3);

		// Info info=new Info();
		Info.display(student);
		Info.display(student2);
		Info.display(student3);

	}

	public static void scenario2() {
		String[] sPhoneNumber1 = { "9755235201", "8759664327" };
		String[] sPhoneNumber2 = { "9755235201", "8759664327" };
		String[] sPhoneNumber3 = { "9122552201", "84254651326" };
		Student student[] = new Student[3];
		student[0] = new Student(100, "Mick", LocalDate.now(), sPhoneNumber1);
		student[1] = new Student(101, "John", LocalDate.now(), sPhoneNumber2);
		student[2] = new Student(101, "nick", LocalDate.now(), sPhoneNumber3);
		// Info info=new Info();
		Info.display(student);
	}

	public static void scenario3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student");
		int noOfStudents = sc.nextInt();
		Student students[] = new Student[noOfStudents];

		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter your ID, name,date of birth(dd/mm/yyy) and phone number");
			int id = sc.nextInt();
			String name = sc.next();
			String date;
			date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);
			students[i] = new Student(id, name, dateOfBirth);
		}
		Info.display(students);
	}

	public static void scenario4() {
	/*	String[] sPhoneNumber2 = { "9755235201", "8759664327" };

		String[] sPhoneNumber3 = { "9122552201", "84254651326" };
		List<Student> students = new ArrayList<Student>();
		Student student2 = new Student(101, "John", LocalDate.now(), sPhoneNumber2);
		Student student3 = new Student(102, "nick", LocalDate.of(2021, 5, 26), sPhoneNumber3);
		students.add(student2);
		students.add(student3);
		Info.display(students);*/
		
		List<Student> students=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
			int id=sc.nextInt();
			String name=sc.next();
			String date=sc.next();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth=LocalDate.parse(date, formatter);
			students.add(new Student(id,name,dateOfBirth));
			System.out.println("Press 0 to Stop? ");
			int var=sc.nextInt();
			if (var==0)
				break;
		} while (true);
		Info.display(students);
	}
	
	/*
	 * public static void scenario5() { Course c1=new Course(1001,5,10000,"DBMS");
	 * Course c2=new Course(1002,3,10000,"Java"); Info.displayCourse(c1);
	 * Info.displayCourse(c2);
	 * 
	 * }
	 * 
	 * public static void scenario6() { Course c[]=new Course[2]; c[0]=new
	 * Course(1001,5,10000,"DBMS"); c[1]=new Course(1002,3,10000,"Java");
	 * Info.displayCourse(c); }
	 * 
	 * public static void scenario7() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter number of Courses"); int noOfCourses =
	 * sc.nextInt(); Course c[]=new Course[noOfCourses];
	 * 
	 * for (int i = 0; i < c.length; i++) {
	 * System.out.println("Enter your ID, name,fee and duration"); int id =
	 * sc.nextInt(); String name = sc.next(); int fee= sc.nextInt(); int duration=
	 * sc.nextInt(); c[i]=new Course(id,duration,fee,name); } Info.displayCourse(c);
	 * }
	 * 
	 * public static void scenario8() { List<Course> course=new ArrayList<Course>();
	 * Scanner sc=new Scanner(System.in); do {
	 * System.out.println("Enter your ID, name,fee and duration"); int id =
	 * sc.nextInt(); String name = sc.next(); int fee= sc.nextInt(); int duration=
	 * sc.nextInt(); course.add(new Course(id,duration,fee,name));
	 * System.out.println("Press 0 to Stop? "); int var=sc.nextInt(); if (var==0)
	 * break; } while (true); Info.displayCourse(course); }
	 */
	public static void scenario9() {
		DegreeCourse dc=new DegreeCourse(1001, 4,400000 ,"B.tech",DegreeLevel.Bachelors, true);
		//dc.calculateMontlyFee();
		Info.displayCourse(dc);
		DiplomaCourse dpc=new DiplomaCourse(1002,3, 40000,"Diploma in CS",Type.Professional);
		//dpc.calculateMontlyFee();
		Info.displayCourse(dpc);
	}
}

package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.ls.LSInput;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;

public class Info {

	public static void display(Student student) {
		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ Student.getCollageName() + " " + Arrays.toString(student.getPhoneNumber()));
		// System.out.println(student.getId()+" "+student.getName()+"
		// "+student.getDateOfBirth()+" "+student.getCollageName());
	}

	public static void display(Student students[]) {
		// for(int i=0;i<student.length;i++)
		// display(student[i]);
		for (Student st : students)
			display(st);
	}

	public static void display(List<Student> students) {
//		for(Student st:students)
//			display(st);
		Iterator<Student> stud = students.iterator();
		while (stud.hasNext()) {
			Student st = stud.next();
			display(st);
		}
//
//		ListIterator<Student> li = students.listIterator();
//		while (li.hasPrevious()) {
//			Student st = li.previous();
//			display(st);
//		}
	}

/*	public static void displayCourse(Course course) {

		//System.out.println(course.getId() + " " + course.getName() + " " + course.getDuration() + " " + course.getFee());

	}

	public static void  displayCourse(Course course[]) {

		for(Course ob:course)
		{
			displayCourse(ob);
		}
	}
	
	public static void displayCourse(List<Course> courses)
	{
		Iterator<Course> itr = courses.iterator();
		while (itr.hasNext()) {
			Course cr = itr.next();
			displayCourse(cr);
		}
	}*/
	public static void displayCourse (Course course) {
		course.calculateMontlyFee();
	}
	
	public static void displayDegreeCourse(DegreeCourse degreeCourse) {
		degreeCourse.calculateMontlyFee();
		
	}
	public static void displayDiplomaCourse(DiplomaCourse diplomaCourse) {
		diplomaCourse.calculateMontlyFee();
	}
}

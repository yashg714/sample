package com.lti.dao;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

import com.lti.model.*;

public class InMemoryStudentDaoImpl implements StudentDao {

	static List<Student> students=new ArrayList<Student>();
	static Set<Course> courses=new HashSet<Course>();
	static Map<Student,Course> erollments=new HashMap<Student, Course>();
	public InMemoryStudentDaoImpl() {
		students.add(new Student(101, "john", LocalDate.of(2021, 5, 26)));
		students.add(new Student(102, "nick", LocalDate.of(2021, 5, 26)));
		students.add(new Student(103, "mick", LocalDate.of(2021, 5, 26)));
		students.add(new Student(104, "mohit", LocalDate.of(2021, 5, 26)));
		students.add(new Student(104, "rohit", LocalDate.of(2021, 5, 26)));
		
		courses.add(new Course(1, 10, 10000,"java"));
		courses.add(new Course(2, 6, 5000,"php"));
		courses.add(new Course(3, 8, 8000,"python"));
	}
	
	@Override
	public boolean addStudent(Student student) {
		return students.add(student);
	}

	@Override
	public void updateStudent(Student student) {
		Student existingStudent=findAStudent(student.getId());
		if(existingStudent!=null)
		{
			int position=students.indexOf(existingStudent);
			students.set(position, student);
			System.out.println("Student Updated");
		}	
		else
		{
			System.out.println("Student not Found");
		}

	}

	@Override
	public void removeStudent(int id) {
		/*
		 * for(int i=0;i<students.size();i++) { if(id==students.get(i).getId()) {
		 * students.remove(i); } }
		 */
		Student existingStudent=findAStudent(id);
		if(existingStudent!=null)
		{
			int position=students.indexOf(existingStudent);
			students.remove(position);
			System.out.println("Student removed Successfully");
		}	
		else
		{
			System.out.println("Student not Found");
		}
	}

	@Override
	public Student findAStudent(int id) {
		for(Student student:students)
		{
			if(id==student.getId())
				return student;
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		
		return students;
	}
	public Course findACourse(int id) {
		for(Course course:courses)
		{
			if(id==course.getId())
				return course;
		}
		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		Student s=findAStudent(studentId);
		Course c=findACourse(courseId);
		if(s==null||c==null)
		{
			System.out.println("course or student id not found");
		}
		else
		{
			erollments.put(s, c);
			System.out.println("Enroll Successfull");
		}
			
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollment() {
		return erollments.entrySet();
	}

}

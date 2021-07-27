package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public class PersistentStudentDaoImpl implements StudentDao {

	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	String sql;
	CallableStatement cstmt;
	public PersistentStudentDaoImpl() {
		conn=ConnectionFactory.getConnection();
	}
	@Override
	public boolean addStudent(Student student) {

		sql="insert into student values(seq_student.nextval,?,?)";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,student.getName());
			stmt.setDate(2,Date.valueOf(student.getDateOfBirth())); 
			//convert java.time.LocalDate(java8) to java.sql.Date
			int rec=stmt.executeUpdate();
			if(rec>0)
			{
				return true;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
//		//insert using procedure
//				sql="{call insertStudent(?,?)}";
//				try {
//					cstmt=conn.prepareCall(sql);
//					cstmt.setString(1,student.getName());
//					cstmt.setDate(2,Date.valueOf(student.getDateOfBirth())); 
//					int rec=cstmt.executeUpdate();
//					if(rec>0)
//					{
//						return true;
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return false;
	}

	@Override
	public void updateStudent(Student student) {
		sql="update student set name=?, dob=? where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,student.getName());
			stmt.setDate(2,Date.valueOf(student.getDateOfBirth()));
			stmt.setInt(3, student.getId());
			int rec=stmt.executeUpdate();
			if(rec>0)
			{
				System.out.println("Update successfull");
			}
			else
			{
				System.out.println("Update Not successfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeStudent(int id) {
		sql="delete student where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,id);
			int rec=stmt.executeUpdate();
			if(rec>0)
			{
				System.out.println("Student removed successfull");
			}
			else
			{
				System.out.println("Student Not removed successfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Student findAStudent(int id) {
		sql="select * from student where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,id);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
				String name=rs.getString(2);
				Date dob= rs.getDate(3);
				Student st=new Student(id,name,dob.toLocalDate());
				return st;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		sql="select * from student";
		try {
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			List<Student> students=new ArrayList<Student>();
			while(rs.next())
			{
				students.add(new Student(rs.getInt(1),rs.getString(2),rs.getDate(3).toLocalDate()));
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void enroll(int student, int courseId) {
		

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollment() {
		
		return null;
	}

}

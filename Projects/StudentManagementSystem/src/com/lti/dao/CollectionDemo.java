package com.lti.dao;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

import com.lti.model.Student;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//-----------------List-----------------
//		List<Student> student=new ArrayList<Student>();
//		Student s1=new Student(1,"Yash",LocalDate.of(2000, 04,12));
//		Student s2=new Student(2,"abc",LocalDate.of(2000, 04,12));
//		Student s3=new Student(3,"xyz",LocalDate.of(2000, 04,12));
//		Student s4=new Student(4,"pqr",LocalDate.of(2000, 04,12));
//		student.add(s1);student.add(s2);student.add(s3);student.add(s4);
//		System.out.println(student.indexOf(s4));
//		List<Integer> num=new ArrayList<Integer>();
//		num.add(10);num.add(20);num.add(30);
//		num.add(40);num.add(50);num.add(60);
//		System.out.println(num.indexOf(20));
		
		//Set<String> set=new HashSet<String>();
		Set<String> set=new TreeSet<String>();

		set.add("Yash");set.add("Nakul");set.add("Yashwant");
		set.add("Abhinav");
		set.remove("Yashwant");
		System.out.println(set);
		
		System.out.println(set.contains("Nakul"));
		
		//Map<Integer, String> credential=new HashMap<Integer, String>();
		Map<Integer, String> credential=new TreeMap<Integer, String>();
		credential.put(1001,"pass@121");
		credential.put(1002,"pass@122");
		credential.put(1003,"pass@123");
		credential.put(1004,"pass@124");
		//credential.put(null,"pass@124");
		System.out.println(credential);
		
		Set<Entry<Integer,String>> entrySet=credential.entrySet();
		
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		while(iterator.hasNext())
		{
			Entry<Integer,String> item=iterator.next();
			System.out.println(item.getKey()+" "+item.getValue());
		}
		
		Iterator<String> allName=set.iterator();
		while(allName.hasNext())
		{
			System.out.println(allName.next());
		}
	}

}

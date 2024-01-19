package com.prowings.model;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import com.prowings.fileio.FileIOUtil;

public class RecordManager {

	private static Scanner scan = new Scanner(System.in);
	private static Map<Integer, Student> record = new TreeMap<>();

	public static Map<Integer, Student> getRecord() {
		return record;
	}

	public static Set<Integer> getStduentIds() {
		Set<Integer> studentIds = record.keySet();
		return studentIds;
	}

	public static void createStudent() {
		Student s = new Student();

		// Id
		System.out.print("Enter Student Id : ");
		int id = s.idValidate(scan.nextInt());
		if (id > 0) {
			s.setId(id);
		} else
			return;

		scan.nextLine();

		// Name
		System.out.print("Enter Student Name : ");
		String name = s.nameValidate(scan.nextLine());
		if (name != null) {
			s.setName(name);
		} else
			return;

		// Age
		System.out.print("Enter Student Age : ");
		int age = s.ageValidate(scan.nextInt());
		if (age > 15) {
			s.setAge(age);
		} else
			return;
		scan.nextLine();

		System.out.print("Enter City : ");
		String city = scan.nextLine();

		System.out.print("Enter State : ");
		String state = scan.nextLine();

		System.out.print("Enter Pincode : ");
		int pincode = scan.nextInt();

		Address add = new Address(city, state, pincode);
		s.setAddress(add);

		record.put(id, s);
		FileIOUtil.serializeData(record);

	}

	public static void displayRecord() {
		
		Collection<Student> studentRecords = record.values();
		Iterator<Student> itr = studentRecords.iterator();
		
		while(itr.hasNext())
			System.out.println("-> "+itr.next());
		
	}
	
}

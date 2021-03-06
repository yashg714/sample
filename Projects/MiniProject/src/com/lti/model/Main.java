package com.lti.model;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.opencsv.CSVReader;  


public class Main {

	public static void main(String[] args) {

		LocalDate rDate,sDate;
		String product,subProduct,issue,subIssue,company,state,submit,cResponse;
		int zipCode,complaintId;
		boolean tResponse=false,cDisputed=false;
		
		CSVReader reader = null;
		ArrayList<Complaint> arr=new ArrayList<Complaint>();
		try {
			// parsing a CSV file into CSVReader class constructor
			reader = new CSVReader(new FileReader("C:\\Users\\yashg\\Downloads\\complaints.csv"));
			String[] nextLine;
			String values[]=new String[14];
			// reads one line at a time
			while ((nextLine = reader.readNext()) != null) {

				rDate=LocalDate.parse(nextLine[0].toString());
				product=nextLine[1].toString();subProduct=nextLine[2].toString();issue=nextLine[3].toString();
				subIssue=nextLine[4].toString();company=nextLine[5].toString(); 
				state=nextLine[6].toString();zipCode=Integer.parseInt(nextLine[7].toString());submit=nextLine[8].toString();
				sDate=LocalDate.parse(nextLine[9].toString());cResponse=nextLine[10].toString();
				if(nextLine[11].toString().equalsIgnoreCase("yes"))
					tResponse=true;
				if(nextLine[12].toString().equalsIgnoreCase("yes"))
					cDisputed=true;
				complaintId=Integer.parseInt(nextLine[13].toString());
				
				arr.add(new Complaint(rDate, product, subProduct, issue, subIssue, company, state, zipCode, submit, sDate, cResponse, tResponse, cDisputed, complaintId));
				for (String token : nextLine) {
					
					System.out.print(token);
					
				}
				
				System.out.print("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(arr.size());
	}

}

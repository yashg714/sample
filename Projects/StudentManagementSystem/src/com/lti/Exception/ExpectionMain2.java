package com.lti.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpectionMain2 {

	public static void main(String[] args) {// throws IOException {
		try {
			fileRead("d:\\copytest.txt");
		} catch (IOException e) {
			System.out.println("File not found");
		}
		
		try {
			fileRead("xyz.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fileRead(String fileName) throws IOException{//throws FileNotFoundException {
		FileReader fileReader=new FileReader(fileName);
		char ch[]=new char[100];
		fileReader.read(ch);
	}
}

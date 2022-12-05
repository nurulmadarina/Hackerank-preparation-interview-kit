package com.hackerank.stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndTheValidString {

	 public static String isValid(String s) {
		return s;
		    // Write your code here

	 }
	 
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result = isValid(s);

//	        bufferedWriter.write(result);
//	        bufferedWriter.newLine();

	        bufferedReader.close();
//	        bufferedWriter.close();
	    }
}

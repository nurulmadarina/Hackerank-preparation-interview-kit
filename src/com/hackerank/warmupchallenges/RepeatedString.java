package com.hackerank.warmupchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
	public static long repeatedString(String s, long n) {
	    // Write your code here
	        long size = s.length(), repeated = n/size;
	        long left = n - (size * repeated);
	        int extra = 0;

	        int count = 0;
	        for(int i = 0; i < size; i++){
	            if(s.charAt(i) == 'a'){
	                ++count;
	            }
	        }

	        for(int i = 0; i < left; i++){
	            if(s.charAt(i) == 'a'){
	                ++extra;
	            }
	        }

	        repeated = (repeated * count) + extra;

	        return repeated;
	    }

	

	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        long n = Long.parseLong(bufferedReader.readLine().trim());

	        long result = repeatedString(s, n);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();

	        bufferedReader.close();
//	        bufferedWriter.close();
	    }

}

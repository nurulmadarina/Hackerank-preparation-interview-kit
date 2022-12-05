package com.hackerank.warmupchallenges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
	public static int countingValleys(int steps, String path) {
	    // Write your code here
	    int valley = 0;
	    int level = 0;
	    char [] code = path.toCharArray();
	        for (char c : code){
	            if (c == 'U') ++level;
	            
	            if (c == 'D') --level;
	            
	            if (level == 0 && c == 'U') ++valley;
	            
	            System.out.println("ini value level cek :: " + level);
	            System.out.println("ini value valley cek :: " + valley);
	        }
	        return valley;
	    }
	    

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int steps = Integer.parseInt(bufferedReader.readLine().trim());

	        String path = bufferedReader.readLine();

	        int result = countingValleys(steps, path);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();

	        bufferedReader.close();
//	        bufferedWriter.close();
	    }

}

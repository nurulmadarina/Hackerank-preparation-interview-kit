package com.hackerank.stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class AlternatingCharacters {
	
	public static int alternatingCharacters(String s) {
		int count=0;        
	        for (int j = 0; j < s.length()-1; j++) {
	            if(s.charAt(j)==s.charAt(j+1))
	                count++;
	          } 
	        System.out.println(count);
		return count;

	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 //       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = alternatingCharacters(s);

 //               bufferedWriter.write(String.valueOf(result));
  //              bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }

}

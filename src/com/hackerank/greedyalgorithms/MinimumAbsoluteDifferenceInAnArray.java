package com.hackerank.greedyalgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class MinimumAbsoluteDifferenceInAnArray {
	
	public static int minimumAbsoluteDifference(List<Integer> arr) {
		
//        Arrays.sort(arr);
        int min = 2000000000;
        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(Math.abs(arr.get(i)- arr.get(i)-1), min);
        }
        System.out.println(min);
        return min;

	}
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = minimumAbsoluteDifference(arr);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();

	        bufferedReader.close();
//	        bufferedWriter.close();
	    }

}

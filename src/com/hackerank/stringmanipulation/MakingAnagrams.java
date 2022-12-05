package com.hackerank.stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

	public static int makeAnagram(String a, String b) {
		Map<Character, Integer> map = new HashMap();
        int count = 0;
        for(int i=0;i<a.length();i++){
        	System.out.println("isi a :: " + a.charAt(i));
            if(map.get(a.charAt(i)) == null){
                map.put(a.charAt(i), 1);
                
            } else {
                int cur = map.get(a.charAt(i));
                map.put(a.charAt(i), cur+1);
                
            }
            System.out.println("cek value first string :: " + map);
        }
        for(int i=0;i<b.length();i++){
        	System.out.println("isi b :: " + b.charAt(i));
            if(map.containsKey(b.charAt(i))){
                int cur = map.get(b.charAt(i));
                if(cur == 1){
                   map.remove(b.charAt(i)); 
                } else {
                    map.put(b.charAt(i), cur-1);
                }
                System.out.println("cek value second string :: " + map);
            } else {
                count++;
            }
        }
        System.out.println("cek value map :: " + map);
        for(Integer i: map.values()){
            count=count+i;
        }
        System.out.println(count);
        return count;

	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 //       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = makeAnagram(a, b);

   //     bufferedWriter.write(String.valueOf(res));
  //      bufferedWriter.newLine();

        bufferedReader.close();
 //       bufferedWriter.close();
    }

}

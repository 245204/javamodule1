package demo;
//Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int elements = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i < elements; i++) {
			int vall = sc.nextInt();
			arr1.add(vall);
		}
		int operation = sc.nextInt();

		for (int j = 0; j < operation; j++) 
		{
			String op = sc.next();

			if (op.equals("Insert")) {
				int pos = sc.nextInt();
				int val = sc.nextInt();
				
				arr1.add(pos, val);
				
			} 
			else if (op.equals("Delete")) 
			{
				int pos1 =sc.nextInt();
				arr1.remove(pos1);
			}
		}
			for(int k:arr1) {
				System.out.println(k);
			}
		
	}
}

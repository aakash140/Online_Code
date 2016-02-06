/**
 * http://www.spoj.com/problems/PALIN/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * Runtime Error:NZEC
 *
 */
public class Test6 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++){
			int input=scan.nextInt();
			System.out.println(getPalindrome(input));
		}
		scan.close();
	}

	public static int getPalindrome(Integer input)throws Exception{
		StringBuffer reverse;
		if(input<10)
			input=10;
		while(true){
			++input;
			reverse=new StringBuffer(input.toString()).reverse();
			if(input.toString().equals(reverse.toString()))
				return input;
		}
	}
}
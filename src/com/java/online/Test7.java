/**
 * http://www.spoj.com/problems/FCTRL2/
 */
package com.java.online;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++){
			int input=scan.nextInt();
			if(input==0||input==1)
				System.out.println(1);
			else
				getFactorial(input);
		}
		scan.close();
	}

	public static void getFactorial(Integer input){
		BigInteger temp=new BigInteger(input.toString());
		while(input>1){
			temp=temp.multiply(new BigInteger((--input).toString()));
		}
		System.out.println(temp);
	}
}
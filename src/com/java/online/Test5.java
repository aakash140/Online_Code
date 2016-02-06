/**
 * http://www.spoj.com/problems/PRIME1/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;


public class Test5 {
	public static void main(String[] args)throws Exception {
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++){
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			totalPrimeNumbers(num1,num2);
			System.out.println();
		}
		scan.close();
	}

	public static void totalPrimeNumbers(int num1,int num2){
		if(num1>2 && num1%2==0)
			num1++;
		if(num2>2 && num2%2==0)
			num2--;
		while(num1<=num2){
			int count=0;
			for(int i=3;i*i<=num1;i=i+2){
				if(num1%i==0){
					++count;
					break;
				}	
			}
			if(count==0 && num1!=1)
				System.out.println(num1);
			if(num1==1 || num1==2)
				num1++;
			else
				num1=num1+2;
		}
	}
}
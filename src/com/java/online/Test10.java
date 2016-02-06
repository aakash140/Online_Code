/**
 * http://www.spoj.com/problems/ACPC10A/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		while(true){
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			if(num1==0 && num2==0)
				break;
			else{
				int num3=scan.nextInt();
				printNext(num1,num2,num3);
			}
		}
		scan.close();
	}

	public static void printNext(int num1,int num2,int num3){
		if(2*num2==num1+num3)
			System.out.println("AP "+(2*num3-num2));
		else
			System.out.println("GP "+(num3*(num3/num2)));
	}
}
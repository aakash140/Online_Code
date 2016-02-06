/**
 * http://www.spoj.com/problems/NSTEPS/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++){
			int x=scan.nextInt();
			int y=scan.nextInt();
			getNumber(x,y);
		}
		scan.close();
	}

	public static void getNumber(int x, int y){
		if(((x+y)%2==1)|| y>x || x-y>2)
			System.out.println("No Number");
		else
			if(x%2==0)
				System.out.println(x+y);
			else
				System.out.println(x+y-1);
	}
}
/**
 *http://www.spoj.com/problems/ADDREV/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;


public class Test4 {
	public static void main(String[] args)throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int lines=scan.nextInt();
		for(int i=0;i<lines;i++){
			String num1=scan.next();
			String num2=scan.next();
			System.out.println(addReverse(num1,num2));
		}
		scan.close();
	}

	public static StringBuffer addReverse(String num1, String num2){
		StringBuffer buffer= new StringBuffer(num1);
		Integer i1=new Integer(buffer.reverse().toString());
		buffer= new StringBuffer(num2);
		Integer i2=new Integer(buffer.reverse().toString());
		Integer i3=i1+i2;
		while(i3%10==0)
			i3=i3/10;
		buffer=new StringBuffer(i3.toString());
		return buffer.reverse();
	}
}
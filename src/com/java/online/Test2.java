/**
 * http://www.codechef.com/problems/INTEST
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args)throws Exception{
		/*Scanner scanner = new Scanner(System.in);
		String fileData=scanner.useDelimiter("\\z").next();*/
		Scanner scanner = new Scanner(new File("C:/Users/aakash2.gupta/Desktop/Input.txt"));
		int count=0;
		int lines=scanner.nextInt();
		long divisor=scanner.nextLong();
		if(divisor>0 && divisor<=1.0e7){
			int dividend=0;
			for(int i=0;i<lines;i++)
				if((dividend=scanner.nextInt())>0 && dividend<1.0e9 && dividend%divisor==0)
					count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
/**
 * http://www.spoj.com/problems/FCTRL/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(new File("src/Input.txt"));
		if(scanner.hasNext()){
			int lines=scanner.nextInt();
			if(lines>0 && lines<=1.0e5){
				int number=0;
				for(int i=0;i<lines;i++)
					if((number=scanner.nextInt())>=1 && number<=1.0e9)
						System.out.println(getZeroes(number));
			}
		}
		scanner.close();
	}

	public static int getZeroes(int input){
		int zeroes=0,result=0,i=0;
		while((result=(int)(input/(Math.pow(5.0, ++i))))>=1)
			zeroes+=result;

		return zeroes;
	}
}
/**
 * http://www.spoj.com/problems/SAMER08F/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int input=0;
		while(scan.hasNext() && (input=scan.nextInt())>0){
			System.out.println(getNumberOfSquares(input));
		}
		scan.close();
	}

	public static int getNumberOfSquares(int input){
		int sum=0;
		while(input>0){
			sum+=Math.pow(input, 2);
			input--;
		}
		return sum;
	}
}
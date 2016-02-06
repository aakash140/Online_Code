/**
 * http://www.codechef.com/problems/TEST
 */
package com.java.online;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Test {

		public static void main(String[] args)throws FileNotFoundException {
			Scanner scan=new Scanner(new File("C:/Users/aakash2.gupta/Desktop/Input.txt"));
			int nextNumber=0;
			while(scan.hasNext() && (nextNumber=scan.nextInt())!=42)
				System.out.println(nextNumber);
			scan.close();
	}
}
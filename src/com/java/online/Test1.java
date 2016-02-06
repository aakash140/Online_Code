/**
 * http://www.codechef.com/problems/HS08TEST
 */
package com.java.online;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner scan=new Scanner(new File("C:/Users/aakash2.gupta/Desktop/Input.txt"));
		if(scan.hasNext()){
			int withdrawalAmount=scan.nextInt();
			double initialBalance=scan.nextDouble();
			final float transCharges=0.5F;
			if(withdrawalAmount%5==0 && withdrawalAmount+transCharges<=initialBalance)
				System.out.println(initialBalance-(withdrawalAmount+transCharges));
			else
				System.out.println(initialBalance);
		}
		scan.close();
	}
}
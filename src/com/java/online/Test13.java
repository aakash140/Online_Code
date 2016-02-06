/**
 * http://www.spoj.com/problems/JULKA/
 */
package com.java.online;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		for(int i=0;i<10;i++){
			String sum=scan.next();
			String diff=scan.next();
			getEach(sum,diff);
		}
		scan.close();
	}

	public static void getEach(String sum,String diff) throws Exception{
		BigInteger total=new BigInteger(sum);
		BigInteger diffference=new BigInteger(diff);
		BigInteger klaudia=total.add(diffference).divide(new BigInteger("2"));
		BigInteger natalia=total.subtract(klaudia);
		System.out.println(klaudia);
		System.out.println(natalia);
	}
}
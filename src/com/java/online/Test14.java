package com.java.online;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args)throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++){
			String base=scan.next();
			String index=scan.next();
			getLastDigit(base,index);
		}
		scan.close();
	}
	
	public static void getLastDigit(String base,String index){
		BigInteger baseBig=new BigInteger(base);
		BigInteger indexBig=new BigInteger(index);
		System.out.println(baseBig.modPow(indexBig, new BigInteger("10")));
	}
}
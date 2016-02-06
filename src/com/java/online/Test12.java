/**
 * http://www.spoj.com/problems/CANDY/
 */
package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int packets=0;
		int sum=0;
		while((packets=scan.nextInt())!=-1){
			int arr[]=new int[packets];
			for(int i=0;i<packets;i++){
				arr[i]=scan.nextInt();
				sum+=arr[i];
			}
			if(sum%packets==0)
				calculateMoves(arr,sum/packets);
			else
				System.out.println(-1);
			sum=0;
		}
		scan.close();
	}

	public static void calculateMoves(int arr[],int each){
		int moves=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<each)
				moves+=each-arr[i];
			else
				moves+=arr[i]-each;
		}
		System.out.println(moves/2);
	}
}
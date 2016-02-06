/**
 * http://www.spoj.com/problems/TOANDFRO/
 */

package com.java.online;

import java.io.File;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) throws Exception{
		//Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(new File("src/Input.txt"));
		int columns=0;
		while((columns=scan.nextInt())>1){
			String encodedMessage=scan.next();
			printDecodedMessage(columns,encodedMessage);
			System.out.println();
		}
		scan.close();
	}

	public static void printDecodedMessage(int columns,String encodedMessage){
		int rows=encodedMessage.length()/columns;
		char[] encodedArray=encodedMessage.toCharArray();
		char[][] decodedArray=new char[rows][columns];
		int k=0;
		for(int i=0;i<rows;i++){
			if(i%2==0)
				for(int j=0;j<columns;j++,k++)
					decodedArray[i][j]=encodedArray[k];
			else
				for(int j=columns-1;j>=0;j--,k++)
					decodedArray[i][j]=encodedArray[k];
		}
		for(int col=0;col<columns;col++){
			for(int row=0;row<rows;row++)
				System.out.print(decodedArray[row][col]);
		}
	}
}
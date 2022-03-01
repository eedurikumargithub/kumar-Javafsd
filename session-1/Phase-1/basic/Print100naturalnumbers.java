package com.simplilearn.basic;

import java.util.Scanner;

public class Print100naturalnumbers {
	public static void main(String[] args) {
		int number, i;
		Scanner sc = new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					System.out.print(i +"\t"); 
				}	
		
	}

}

package com.simplilearn.uncheckedexception;
import java.util.Scanner;

public class Demo4 {
	//runtime:NullPointerException

	public static void main(String[] args) {
			
			String name=null;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter email");
			String email=sc.next();
			
			if(name.equals(email))
				System.out.println("User Authenticated");
			else
				System.out.println("Not valid user");
			
		}
	}

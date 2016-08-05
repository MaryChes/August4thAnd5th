package com.notes.thursday; //STRING EQUALITY

import java.util.Scanner;

public class MoreArraysAndStuff 
{
	public static void main(String[] args) 
	{
		Scanner alien = new Scanner(System.in);
		System.out.println("How is your day?");
		System.out.println("You can choose great and bad.");
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase()) 
		{
		case "great":
			System.out.println("Great to hear!");
			break;
		case "bad":
			System.out.println("I'm sorry");
		
		default:
			System.out.println("What?");
			break;
		}
	}
}

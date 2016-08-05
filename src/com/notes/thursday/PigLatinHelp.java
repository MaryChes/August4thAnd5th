package com.notes.thursday;

import java.util.Scanner;

//Char and Char Arrays
//Keep in mind:
//char
//char array
//scanner
//switch statements
//methods
public class PigLatinHelp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		StringBuilder modifyUserInput = new StringBuilder(userInput); //convert to string builder because string is immutable
		char firstLetter = modifyUserInput.charAt(0);
		
		System.out.println(firstLetter);
		
		modifyUserInput.deleteCharAt(0);
		System.out.println(modifyUserInput);
		
		modifyUserInput.insert(0, 'x');
		System.out.println(modifyUserInput);
		
		char[] hi = {'h', 'i', ' '};
		modifyUserInput.insert(0,hi);
		System.out.println(modifyUserInput);
		
		modifyUserInput.append(hi);
		System.out.println(modifyUserInput);
	}
	
}
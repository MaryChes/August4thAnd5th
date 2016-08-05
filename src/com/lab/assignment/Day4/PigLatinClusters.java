package com.lab.assignment.Day4;

import java.util.Scanner;

public class PigLatinClusters 
{
	
	public static void main(String[] args) 
	{
		int x = 5; //Added this so the program keeps running
		
		while (x == 5) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("This is a Pig Latin Translator.");
			System.out.println("Input the word you would like translated and press enter.");
			String userInput = sc.nextLine();
			userInput = userInput.toLowerCase();
			StringBuilder modifiedUserInput = new StringBuilder(userInput);
			char firstLetter = modifiedUserInput.charAt(0);
			char secondLetter = modifiedUserInput.charAt(1);
			char thirdLetter = modifiedUserInput.charAt(2);
			
			if (theFirstLetterIsAVowel(firstLetter)) 
			{
				modifiedUserInput.append("ay");
				System.out.println(modifiedUserInput + "\n");
				
			} 
			else if (isConsonant(secondLetter))
			{
				modifiedUserInput.append(firstLetter);
				modifiedUserInput.append(secondLetter);
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.append("ay");
				System.out.println(modifiedUserInput);	
			}
			else if (isConsonantTriple(thirdLetter))
			{
				modifiedUserInput.append(firstLetter);
				modifiedUserInput.append(secondLetter);
				modifiedUserInput.append(thirdLetter);
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.append("ay");
				System.out.println(modifiedUserInput);
			}
			else
			{
				modifiedUserInput.append(firstLetter + "ay");  
				modifiedUserInput.deleteCharAt(0);
				System.out.println(modifiedUserInput + "\n");
			}
		}	
	}
	
	public static boolean theFirstLetterIsAVowel(char firstLetter)
	{ 
		char[] vowel = {'a', 'e','i','o','u'};
		boolean isThisAVowel = false;
		for (int i = 0; i < vowel.length; i++) 
		
		{
			if (firstLetter == vowel[i])
			{
				isThisAVowel = true;
			}
		}
		return isThisAVowel;		
	}
	public static boolean isConsonant(char secondLetter)
	{ 
		char[] vowel = {'a', 'e','i','o','u'};
		boolean isACluster = true;
		for (int i = 0; i < vowel.length; i++) 
		
		{
			if (secondLetter == vowel[i])
			{
				isACluster = false;
			}
		}
		return isACluster;
	}
	public static boolean isConsonantTriple(char thirdLetter)
	{ 
		char[] vowel = {'a', 'e','i','o','u'};
		boolean isATripleCluster = true;
		for (int i = 0; i < vowel.length; i++) 
		
		{
			if (thirdLetter == vowel[i])
			{
				isATripleCluster = false;
			}
		}
		return isATripleCluster;
	}
	     
}

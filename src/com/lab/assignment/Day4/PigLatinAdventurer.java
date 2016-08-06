package com.lab.assignment.Day4;  
//http://stackoverflow.com/questions/37502100/pig-latin-translator-finding-consonant-clusters FIGURE OUT LATER
import java.util.Scanner;
public class PigLatinAdventurer 
{
	private static boolean pigLatin = true;
	public static void main(String[] args) 
	{
		while (pigLatin == true)
		{
			Scanner sc = new Scanner(System.in);
			Scanner scNumber = new Scanner(System.in);
			System.out.println();
			System.out.println("\nThis is a Pig Latin Sentence Translator. \nEnter the number of words in the sentence you wish to translate.");
			int numberOfWordsInTheSentence = scNumber.nextInt();
			String[] wordsInTheSentence = new String[numberOfWordsInTheSentence];
			System.out.println("Input each word of your sentence,   one at a time. "
					+ "\nPress enter after you input each word.");
			System.out.println();
			String[] finalTranslation = new String[numberOfWordsInTheSentence];
				
			for (int i = 0; i < wordsInTheSentence.length; i++) 
			{
			System.out.println("Enter word " + (i + 1 ) + ":");
			wordsInTheSentence[i] = sc.nextLine();
			wordsInTheSentence[i] = wordsInTheSentence[i].toLowerCase();
			}
			
			for (int i = 0; i < wordsInTheSentence.length; i++)
			{
				StringBuilder modifiedWordsInTheSentence = new StringBuilder(wordsInTheSentence[i]);
				char firstLetter = modifiedWordsInTheSentence.charAt(0);
				char secondLetter = ' ';
				if (modifiedWordsInTheSentence.length() > 1)
				{
					secondLetter = modifiedWordsInTheSentence.charAt(1);
				}
				if (theFirstLetterIsAVowel(firstLetter))
				{
					modifiedWordsInTheSentence.append("ay ");
					System.out.print(modifiedWordsInTheSentence);
					
				}
				else if (isConsonant(secondLetter))
				{
					modifiedWordsInTheSentence.append(firstLetter);
					modifiedWordsInTheSentence.append(secondLetter);
					modifiedWordsInTheSentence.deleteCharAt(0);
					modifiedWordsInTheSentence.deleteCharAt(0);
					modifiedWordsInTheSentence.append("ay ");
					System.out.print(modifiedWordsInTheSentence);	
				}
				else
				{
					modifiedWordsInTheSentence.append(firstLetter + "ay ");  
					modifiedWordsInTheSentence.deleteCharAt(0);
					System.out.print(modifiedWordsInTheSentence);
				}
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
}

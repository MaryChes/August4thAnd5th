package com.lab.assignment.Day4;  
//http://stackoverflow.com/questions/37502100/pig-latin-translator-finding-consonant-clusters FIGURE OUT LATER
import java.util.Scanner;

public class PigLatinLegendary 
{
	private static boolean pigLatin = true;
	public static void main(String[] args) 
	{
		while (pigLatin == true)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println();
			System.out.println("\nThis is a Pig Latin Sentence Translator. \nEnter the sentence you wish to translate.");
			String userSentence = sc.nextLine();
			String [] wordsInUserSentence = userSentence.split("\\s");
			
//			wordsInUserSentence[i] = wordsInUserSentence[i].toLowerCase();
			
			
			for (int j = 0; j < wordsInUserSentence.length; j++)
			{
				StringBuilder modifiedWordsInTheSentence = new StringBuilder(wordsInUserSentence[j]);
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
package com.notes.thursday;

public class MethodsFizzBuzz 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <110; i++) 
		{
			if (divisibleByAllThree(i)) 
			{
				System.out.println("Fizz Buzz Bang");
			}
			else if (divisibleByThreeAndFive(i))
			{
				System.out.println("Fizz Buzz");
			}
			else if (divisibleByThreeAndSeven(i))
			{
				System.out.println("Fizz Bang");
			}
			else if (divisibleBySevenAndFive(i))
			{
				System.out.println("Buzz Bang");
			}
			else if(divisibleByOnlySeven(i));
			{
				System.out.println("Bang");
			}
			else if(divisiblebyOnlyFive(i));
			{
				System.out.println("Buzz");
			}
			else if (divisibleByOnlyThree(i));
			{
				System.out.println("Fizz");
			}
			else 
			{
				System.out.println(i);
			}
			
		}
			
	}	
	
	
	
	public static boolean divisibleByAllThree(int fromTheForLoop)
	{ 
		boolean howIsThis = false;
		if(((fromTheForLoop % 3)==0) && ((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		return howIsThis;	
	}
	public static boolean divisibleByThreeAndFive(int fromTheForLoop)
	{
		boolean howIsThis = false;
		if(((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0))
		{
			howIsThis = true;
		}
		return howIsThis;
	}
	public static boolean divisibleByThreeAndSeven(int fromTheForLoop)
	{
		boolean howIsThis = false;
		if(((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		return howIsThis;
	}
	public static boolean divisibleBySevenAndFive(int fromTheForLoop)
	{
		boolean howIsThis = false;
		if(((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		return howIsThis;
	}
	private static boolean divisibleByOnlySeven(int fromTheForLoop) 
	{
		boolean HowIsThis = false;
		if ((fromTheForLoop % 7) == 0)
		{
			HowIsThis = true;
		}
		return HowIsThis;
	}
	private static boolean divisiblebyOnlyFive(int fromTheForLoop) 
	{
		boolean HowIsThis = false;
		if ((fromTheForLoop % 5) == 0)
		{
			HowIsThis = true;
		}
		return HowIsThis;
	}
	private static boolean divisibleByOnlyThree(int fromTheForLoop) 
	{
		boolean HowIsThis = false;
		if ((fromTheForLoop % 3) == 0)
		{
			HowIsThis = true;
		}
		return HowIsThis;
	}
	
}
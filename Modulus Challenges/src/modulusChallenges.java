import java.util.Scanner;

public class modulusChallenges
	{

		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				configureLeapYear();
				countFizzBuzz();
				
			}
		
		public static void configureLeapYear()
		{
			System.out.println("Type a year to see if it was or will be a leap year.");
			int inputYear = userInput.nextInt();
			
			if (inputYear % 100 == 0 && inputYear %400 != 0)
				{
					System.out.println(inputYear + " is not a leap year.");
				}
			else if (inputYear % 4 ==0)
				{
					System.out.println(inputYear + " is a leap year.");
				}
			else
				{
					System.out.println(inputYear + " is not a leap year.");
				}
		}
		
		public static void countFizzBuzz()
		{
			for (int i = 1; i<=100; i++)
				{
					if (i % 3==0 && i % 5==0)
						{
							System.out.println("FizzBuzz");
						}
					else if (i % 3==0)
						{
							System.out.println("Fizz");
						}
					else if (i % 5==0)
						{
							System.out.println("Buzz");
						}
					else 
						{
							System.out.println(i);
						}
						
					
				}
		}
	}

import java.util.Random;
import java.util.Scanner;

/*
 * Chris Duncan
 * Object Oriented Progrmaing
 * Spring 2020 Semester, week 1, Demo
 * Random Number Guessing
 */

public class AgeGuess 
{
    public static void main(String[] args)
    {
				 
				// define variables     
			      Random random = new Random();
			      Scanner scan = new Scanner(System.in);
			      int number = random.nextInt(101);
			      int ageguess = -1;
			      
			         
			    // Get user input   
			      while (ageguess != number) 
			      {
			       System.out.print("Guess my age: ");
			       ageguess = scan.nextInt();
			          
			     // Validate guess
			         if (ageguess < number) 
			             System.out.println("Thank you, but I'm not that young, try agian");
			         else if (ageguess > number) 
			                 System.out.println("How old do you think I AM, go lower");
			      } 
			      // Answer output
			         System.out.println("Nailed it, I'm " + number);
			   
    // Close the scanner object
	scan.close();
    }
} 
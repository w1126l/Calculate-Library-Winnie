/* This class will contain a main method and handle interactions with the user.
 * @author Winnie Liang
 * Version 1 10/4/18
 */

import java.util.*; // Allowing user input.


public class QuadraticClient {
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in); // Opening the scanner.
		
		System.out.println("Welcome to the Quadratic Describer!"); 
		System.out.println(""); // Introduction to program.
		System.out.println("This program will accept the coefficients of a quadratic function and return to the ");
		System.out.println("user a description of the graph, including the direction the graph opens, the vertex, ");
		System.out.println("and the x-axis intecepts.");
		System.out.println(""); // Description of the purpose of the program.
		System.out.println("Please provide coefficients for the standard form of your quadradic equation.");
		System.out.println(""); // Prompting user for information.
		System.out.println("Standard form for quadratic equation: ax^(2) + bx + c");
		System.out.print("What is your a, b, and c? ");
		System.out.println("Please type your numbers out with ONLY SPACES in between each number.");
		System.out.println(""); // Prompting user for information.
		
		double a = userInput.nextDouble(); // Accepting first coefficient.
		double b = userInput.nextDouble(); // Accepting second coefficient.
		double c = userInput.nextDouble(); // Accepting third coefficient.
		
		System.out.println("a = " + a); // Printing first coefficient for the user to check.
		System.out.println("b = " + b); // Printing second coefficient for the user to check.
		System.out.println("c = " + c); // Printing third coefficient for the user to check.
		
		System.out.println(""); // Just to make it look neater :).
		
		System.out.println(Quadratic.quadDescriber(a, b, c)); // Printing the description of the equation's graph.
		
		System.out.println("Done!"); // Telling user the program is done.
		userInput.close(); // Closing the scanner.
		
	}

}
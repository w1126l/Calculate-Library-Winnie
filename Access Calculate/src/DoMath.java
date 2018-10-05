/* This is the client code for the Calculate Library
 * @author Winnie Liang
 * Version 2 10/4/18
 */

public class DoMath {
	
	public static void main(String[]args) {
	
		System.out.println(Calculate.square(78));
		
		System.out.println(Calculate.cube(-78));
	
		System.out.println(Calculate.average(0, 0));
	
		System.out.println(Calculate.average(0, 0, 0));
		
		System.out.println(Calculate.toDegrees(30));
	
		System.out.println(Calculate.toRadians(6));
	
		System.out.println(Calculate.discriminant(3, 1, 2));
		
		System.out.println(Calculate.toImproperFrac(3, 1, 4));
		
		System.out.println(Calculate.toMixedNum(7, 2));
		
		System.out.println(Calculate.foil(2, 3, 6, -7, "x"));
		
		System.out.println(Calculate.isDivisibleBy(5.6, 7.8));
		
		System.out.println(Calculate.absValue(-5.2));
		
		System.out.println(Calculate.max(2.3, 5.7));
		
		System.out.println(Calculate.max(1.2, -5.7, -9.0));
		
		System.out.println(Calculate.min(5, 9));
		
		System.out.println(Calculate.round2(98.30989));
		
		System.out.println(Calculate.exponent(5.6, 0));
		
		System.out.println(Calculate.factorial(5));
		
		System.out.println(Calculate.isPrime(90));
		
		System.out.println(Calculate.gcf(8, 16));
		
		System.out.println(Calculate.sqrt(87));
		
		System.out.println(Calculate.quadForm(1, 4, -2));
	
	}

}
package myJavaProjects;

import java.util.Scanner; //brings in the scanner 
// the scanner get the input from the user and stores in a variable

public class HelloWorld_yes {

	// main method needs to be there
	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("This is the first intro to Java");
		
		int a= 5;
		int b = 10;
		double tuna = 1.5;  // this is the float in Python 
		
		System.out.println(tuna);
		System.out.println(tuna+a);
		
		System.out.println("I want to count to " + a);
		
		System.out.println(a+b);
		System.out.println((a*b)*2);
		
		System.out.println("The examples below require user input");
		
		//getting user input and printing it examples
		
		// we need to make a variable that will hold the input from the 
		//keyboard
		Scanner sof = new Scanner(System.in);
		// the sof variable holds whatever we input from the keyboard
		// system in is to know where to get input from
		System.out.println(sof.nextLine());
		// next line is for inputting strings
		
		// mini calculator project
		Scanner calculator = new Scanner(System.in);
		// all variables of the same type can be on the same line as below a
		// as opposed to writing a variable on each line
		double first_num, second_num, third_num, average; 
		
		System.out.println("Enter the first number: ");
		first_num= calculator.nextDouble();
		// next double is a method for inputting numbers
		// the first number you type will be stored in 
		// first_num
		
		System.out.println("Enter the second number: ");
		second_num= calculator.nextDouble();
		
		System.out.println("Enter the third number: ");
		third_num= calculator.nextDouble();
		
		average=(first_num+second_num+third_num)/3;
		System.out.println("Your average is " + average);

	}
	
}



/* This program will randomly generate a number
 * which is different than the numbers that the
 * user entered. */

import java.util.Scanner;		//importing Scanner in Java

public class DifferentRandomNumber {
	//Main method
	public static void main(String[] args) {
		System.out.println("Please specify how many numbers you want to enter: "); //Asking for the user input
		Scanner input = new Scanner(System.in); //creating an object to store the user input for the total numbers
		int nos = input.nextInt();		//storing the total numbers of the input in the variable "nos"
		int numbers[] = new int[nos];	//creating an array to store all the numbers provided by the user
		System.out.println("Please enter "+nos+" numbers to guess the random number generated: "); //asking the user for the numbers
		
		/* loop to store the numbers provided by the user*/
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		input.close();	//closing the input
		System.out.println("The random number generated (different than the inputs) is: "+getRandom(numbers));	//displaying the random number generated
			
	}
	//method to obtain the random number generated
	public static int getRandom(int... numbers) {
		int randomNumber = (int) (Math.random() * 54+1); //generating a random number up to 54
		
		/* loop to get a random number, which is not equal to any of the numbers, that the user has entered */
		for (int i=0; i<numbers.length; i++) {
			if (randomNumber == numbers[i]) {
				randomNumber = (int) (Math.random() *54+1);
				i=0; //if the number matches with any of the user input, value of "i" will go back to "0", repeating the loop
			}
		}
		return randomNumber;	//returning the integer randomNumber to the method
	}
	
}

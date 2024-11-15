package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner myObj = new Scanner (System.in);
		
		System.out.println("Enter the number:");
		
		int input = myObj.nextInt();
		int output = 0;
		
		for (int i = input; i > 0; i /= 10) {
			
			int rem = i % 10;
			output = output * 10 + rem;
			
		}
		
			if (input == output) {
				
				System.out.println("It is palindrome number");
		
			} 
			
			else {
				
				System.out.println("Not palindrome number");
			}
		}
	}

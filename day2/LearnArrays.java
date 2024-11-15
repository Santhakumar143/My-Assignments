package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		int[] age= {30,23,12,45,89,25,43};
		
		System.out.println("Print the second value: "+ age[1]);

		int length = age.length;
		
		System.out.println("Length of the array: "+length);
		
		System.out.println("Print the last value: "+age[length-1]);
		
		Arrays.sort(age);
		
		System.out.println("After sort index 0: "+age[0]);
		
        System.out.println();
        System.out.println("****************************");
		
		for (int i = 0; i < age.length; i++) {
			
			System.out.println(age[i]);
		}
		
		System.out.println();
		
		for (int i = age.length-1; i>=0; i--) {
			
			System.out.println(age[i]);
		}
	}

}

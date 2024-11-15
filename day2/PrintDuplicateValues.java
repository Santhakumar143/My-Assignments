package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		
		int[] num= {23,54,67,12,45,90,23,12};
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					
					System.out.println("Duplicate value: "+num[i]);
				}
			}
			
		}
	
		Arrays.sort(num);
		
		System.out.println();
		System.out.println("Ascending Order");
		System.out.println("***************");
		System.out.println();
		
		for (int i = 0; i < num.length-1; i++) {
			
			if (num[i]==num[i+1]) {
				
				System.out.println("Duplicate value: "+num[i+1]);
				
			}
			
		}
		
	}
	
}  	     
                




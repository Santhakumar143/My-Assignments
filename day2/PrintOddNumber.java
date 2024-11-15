package week1.day2;

public class PrintOddNumber {

	public static void main(String[] args) {

		int maxRange=10;
		
		System.out.println("Odd Number");
		System.out.println();
		
		for (int i=1;i<maxRange;i++)
		{
			
			if(i%2==1) {
				
				System.out.println(i);
			}
		}
	
	}

}

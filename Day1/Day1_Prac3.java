import java.util.Scanner;

public class Day1_Prac3 {

	public static void main(String[] args) {
		
		int lastDigit= 0;
		int oddAdd = 0;
		System.out.println("Enter a number:-");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num < 0) {
			System.out.println("number too small");
		}
		else if(num > 32767) {
			System.out.println("number too large");
		}
		
		else {	
				while(num!=0) {
					lastDigit = num % 10;
					
					if (lastDigit %2 != 0) {
						oddAdd =  oddAdd + lastDigit;
					}
					else {
						//no action
					}
					
					num = num/10;
				}
				
				System.out.println("Sum of Odd numbers:- " +oddAdd);
		}
	}

}

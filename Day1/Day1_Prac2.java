import java.util.Scanner;

public class Day1_Prac2 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		if (n < 0) {
			System.out.println("number too small");
		}
		
		else if(n > 32767 ) {
			System.out.println("number too large");
		}
		
		else {
			while(n%2==0) {
				n=n/2;
			}
			if(n==1) {
				System.out.println("number is power of 2");
			}
			
			else {
				System.out.println("number is not power of 2");
			}
		}
	}
}

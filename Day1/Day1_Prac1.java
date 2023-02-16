import java.util.Scanner;

public class Day1_Prac1 {
	public static void main(String[] args) {
		System.out.println("Enter Your Salary");
		Scanner a = new Scanner(System.in);
		int salary= a.nextInt();
		
		System.out.println("Enter Your Shift");
		Scanner b = new Scanner(System.in);
		int shift= b.nextInt();
		
		if(salary> 8000 || salary < 0 || shift < 0 ) {
			if (salary> 8000) {
				System.out.println("Salary is too large");
			}
			
			else if(salary < 0) {
				System.out.println("Salary is too less");
			}
			else if(shift < 0) {
				System.out.println("Shifts too small");
			}
		}
		else {
			double final_cal = (0.02 * shift * salary) +(0.5 * salary);
					System.out.println(final_cal);	
		}
		
	}
}

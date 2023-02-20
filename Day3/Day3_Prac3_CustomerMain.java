import java.util.*;
public class Day3_Prac3_CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day3_Prac3_Customer customer1 = new Day3_Prac3_Customer();
		
		System.out.println("Enter the details:-");
		Scanner s = new Scanner(System.in);
		String details = s.nextLine();
		
		customer1.customerDetails(details);
	}

}

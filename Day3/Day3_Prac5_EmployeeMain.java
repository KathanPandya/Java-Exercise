import java.util.*;


public class Day3_Prac5_EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_Prac5_Employee employee1 = new Day3_Prac5_Employee();
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Name:- ");
		String name = s.nextLine();
		employee1.setName(name);
		
		System.out.println("Enter Address:- ");
		String address = s.nextLine();
		employee1.setAddress(address);
		
		System.out.println("Enter Number:- ");
		String mobile = s.nextLine();
		employee1.setMobile(mobile);
		
		
		String a_name = employee1.getName();
		String b_address = employee1.getAddress();
		String c_mobile = employee1.getMobile();
		
		System.out.println("Employee Details");
		System.out.println("Name:-" +a_name);
		System.out.println("Address:-" +b_address);
		System.out.println("Mobile:-" +c_mobile);
		System.out.println("Verify and Update Details");
		System.out.println("Menu \n "  +"1. Update Employee name \n " +"2. Update Employee Address \n "
				+"3. Update Employee mobile \n " +"4. All Information Correct/Exit");
		
		while(true) {
			System.out.println("Enter 1/2/3 or 4:-");
			int option = s.nextInt();
			
			if(option == 1) {
				System.out.println("Current name is:- " +a_name);
				System.out.println("Enter Employee Name to update:-");
				a_name = s.next();
				employee1.setName(a_name);
				System.out.println("Updated Name is:-" +a_name);
			}
			else if(option == 2) {
				System.out.println("Current address is:- " +b_address);
				System.out.println("Enter Employee Address to update:-");
				b_address = s.next();
				employee1.setAddress(address);
				System.out.println("Updated Address is:-" +b_address);
				
			}
			
			else if (option == 3) {
				System.out.println("Current number is:- " +c_mobile);
				System.out.println("Enter Employee Number to update:-");
				c_mobile = s.next();
				employee1.setMobile(c_mobile);
				System.out.println("Updated Number is:-" +c_mobile);
			}
			else if(option ==4) {
				System.out.println("The Details are");
				System.out.println("Name:-" +a_name);
				System.out.println("Address:-" +b_address);
				System.out.println("Mobile:-" +c_mobile);
				System.exit(0);
			}
			
		}
		
		
	}
}

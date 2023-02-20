import java.util.Scanner;
public class Day3_Prac1_EmployeeMain {
	
	public static void main(String[] args) {
		
        //created object e1
		Day3_Prac1_Employee e1=new Day3_Prac1_Employee();
		
		//created a scanner object to take value from user and setting that value in string name
		System.out.println("Enter Name:-");
		Scanner a = new Scanner(System.in);
		String name = a.nextLine();
		e1.setName(name);
		
		System.out.println("Enter Address:-");
		Scanner b = new Scanner(System.in);
		String address = b.nextLine();
		e1.setAddress(address);

		System.out.println("Enter Mobile:-");
		Scanner c = new Scanner(System.in);
		String mobile = c.nextLine();
		e1.setMobile(mobile);
		
		System.out.println("Employee Details:-");
		System.out.println("Name:- "  +e1.getName());
		System.out.println("Address:- " +e1.getAddress());
		System.out.println("Mobile:- " +e1.getMobile());
	}


}

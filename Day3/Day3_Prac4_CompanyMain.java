import java.util.Scanner;

public class Day3_Prac4_CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day3_Prac4_Company company1 = new Day3_Prac4_Company();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the company name:- ");
		String name = s.nextLine();
		company1.setName(name);
		
		System.out.println("Enter the employees:- ");
		String employees = s.nextLine();
		company1.setEmployees(employees);
		
		System.out.println("Enter team lead:- ");
		String teamlead = s.nextLine();
		company1.setTeamlead(teamlead);
		
		String a = company1.getName(); 
		String b = company1.getTeamlead();
		String c = company1.getEmployees();
		
		String str = company1.getEmployees();
		String[] arrOfStr = str.split(",",0);
		
		int flag = 0;
		
		for (int i = 0; i < arrOfStr.length; i++) {
			if (b.equalsIgnoreCase(arrOfStr[i])) {
				flag++;
			}
			else {
				continue;
			}
			
			
		}
		
		if (flag == 1) {
			System.out.println("Name:- " +a);
			System.out.println("Employees:- " +c);
			System.out.println("Lead:- " +b);
		}
		if(flag == 0){
			System.out.println("Invalid Input");
		}
		
	}
	
	

}

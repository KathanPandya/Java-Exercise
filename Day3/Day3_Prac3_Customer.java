
public class Day3_Prac3_Customer {
	
	private String name;
	private String address;
	private String mobile;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void customerDetails(String s1) {
		String str =  s1 ;
		String[] arrsOfStr = str.split(",",0);
		
		System.out.println("Name:- " +arrsOfStr[0]);	
		System.out.println("Address:- " +arrsOfStr[1]);
		System.out.println("Mobile:- " +arrsOfStr[2]);
		
	}
}

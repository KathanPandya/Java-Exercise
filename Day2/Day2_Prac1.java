import java.util.Scanner;
public class Day2_Prac1 {
	
	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array_size = new int[n];
		int sum_even = 0;
		int sum_odd = 0;
		for (int i=0;i<n;i++) {
			System.out.println("Enter element of array at index:" +i);
			array_size[i]= s.nextInt();
			if(array_size[i]%2==0) {
				sum_even = sum_even + array_size[i];
			}
			else {
				sum_odd = sum_odd + array_size[i];
			}
		}
		if(sum_even> sum_odd) {
			System.out.println("Sum of even number is:- " +sum_even);
		}
		
		else if(sum_even == sum_odd) {
			System.out.println("Sum of odd and even is same");
		}
	
	    else {
	    	System.out.println("Sum of odd number is:- " +sum_odd);
		}

}
}
import java.util.Scanner;
public class Day2_Prac2 {
	
	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array_size = null;		
		if(n<0) {
			System.out.println("A");
		}
		
		else if(n%2!=0) {
			System.out.println("Array size should be multiple of 2");
		}
		else {
			array_size = new int[n];
			for (int i=0;i<=n-1;i++) {
				System.out.println("Enter element of array at index:" +i);
				array_size[i]= s.nextInt();
			}
			System.out.println("Enter runs above:");
			int ra = s.nextInt();
			
			for(int j =0; j < n; j++ ) {
				if(array_size[j] > ra) {
					System.out.println("Player id " +array_size[j-1] +" has runs above " +ra);
				}
			}
		}
}
}
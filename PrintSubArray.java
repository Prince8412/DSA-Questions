import java.util.Scanner;

public class PrintSubarrays {
	
	public static void Subarrays(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				for(int k = i; k<=j; k++) {
					System.out.print(arr[k] + "\t");;
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		Subarrays(arr);
	}

}
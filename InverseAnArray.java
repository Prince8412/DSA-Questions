import java.util.Scanner;

public class InverseAnArray {
	
	public static int[] InverseArr(int[] arr , int[] invarr) {
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]>arr.length-1) {
//				return -1;
//			}
//		}
		for(int i = 0; i<arr.length; i++) {
			int v = arr[i];
			invarr[v] = i;
		}
		
		return invarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] invarr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		int[] result = InverseArr(arr, invarr);
		for(int i = 0; i<invarr.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
/*  //// Both of these functions will work with class Arrays (importing arrays) ////
 * 
 * this is for finding the minimum of the given array
 * int[] array = {1, 2, 3, 4, 5};
int min = Arrays.stream(array).min().getAsInt();

this is for finding the maximum of the given array
int[] array = {1, 2, 3, 4, 5};
int max = Arrays.stream(array).max().getAsInt();

*/

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int span = max - min;
		System.out.print(span);
	}

}

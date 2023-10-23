import java.util.Scanner;

public class RotateAnArrayWithGivenNumber {
	public static void reverse(int[] arr, int i, int j) {
		int li = i;
		int ri = j;
		
		while(li<ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			
			li++;
			ri--;
		}
	}
	
	public static int[] rotateArray(int[] arr,int k) {
		k = k % arr.length;
		if(k<0) {
			k = k + arr.length;
		}
		// Part 1 Reversing
		reverse(arr, 0, arr.length - k -1);
		
		// Part 2 Reversing
		reverse(arr, arr.length-k, arr.length-1);
		
		// Part 3 Reversing (The whole Array)
		reverse(arr, 0, arr.length-1);
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		int[] result = rotateArray(arr , k);
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i]);
		}
	}

}

//////////////////// Simple Method (using loop) /////////////////////
//package PeepCoding;
//
//import java.util.Scanner;
//public class Find_nPm {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int m = s.nextInt();
//		int nfact = 1;
//		int nmmfact = 1;
//		
//		for (int i = 1; i<=n; i++) {
//			nfact = nfact*1;
//		}
//		
//		for (int i = 0; i<=n-m; i++) {
//			nmmfact = nmmfact*1;
//		}
//		
//		int npm = nfact*nmmfact;
//		
//		System.out.println(n+"P"+m+"="+npm);
//	}
//
//}

//////////// Using Funtion ////////////////////

package PeepCoding;
import java.util.*;
public class Find_nPm{
	
	public static int fact(int x) {
		int rv = 1;
		for (int i = 1; i<=x; i++) {
			rv = rv *i;
		}
		return rv;
	}
	
	public static void display(int n, int m, int npm) {
		System.out.println(n+"P"+m+"="+npm);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int nfact = fact(n);
		int nmmfact = fact(n-m);
		
		int npm = nfact/nmmfact;
		display(n,m,npm);
	}
}
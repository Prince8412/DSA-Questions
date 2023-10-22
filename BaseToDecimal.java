import java.util.Scanner;

public class BaseToDecimal {

	public static int getBaseValue(int n, int b) {
		int rv = 0;
		int p = 1;
		while(n>0) {
			int rem = n%b;
			n = n/b;
			rv = rv + rem * p;
			p = p*b;
		}
		return rv;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int result = getBaseValue(n,b);
		System.out.println(result);
	}

}

import java.util.Scanner;

public class DecimalToBase {
	
	public static int getValue(int n, int b) {
		int p = 1;
		int rv = 0;
		while(n>0){
			int rem = n%b;
			n = n/b;
			
			rv = rv + rem*p;
			p = p*10;
		}
		return rv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = s.nextInt();
		int result = getValue(n,b);
		System.out.println(result);
	}

}

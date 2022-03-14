import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rep = scan.nextInt();
		int[] a = new int[rep];
		int[] b = new int[rep];
		int[] c = new int[rep];
		
		for(int i = 0; i < rep; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			
			c[i] = a[i] + b[i];
		}
		
		for(int i = 0; i < rep ; i++) {
			System.out.printf("Case #%d: %d + %d = %d \n", i+1, a[i], b[i], c[i]);
		}
	}
}

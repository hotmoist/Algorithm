import java.util.Scanner;


public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] array; 
		int rep = scan.nextInt();
		array = new int[rep];
		int a;
		
		
		for(int i =0; i < rep; i++) {
			a= 0;
			for(int b = 0; b < 2; b++) {
				a += scan.nextInt();
			}
			
			array[i] = a; 
		
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

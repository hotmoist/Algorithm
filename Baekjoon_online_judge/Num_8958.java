import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int rep = scan.nextInt();
		int[] array = new int[rep];
		
		for(int i = 0; i < rep; i++) {
			String s = scan.next();

			int count = 0;
			int sum = 0;
			char[] a = s.toCharArray();
		
			
			for (int j = 0; j < a.length; j++) {
				if (a[j] == 'O') {
					count++;
				} else if (a[j] == 'X') {
					sum += (count * (count + 1)) / 2;
					count = 0;
				}
				if (j == a.length-1 && count != 0) {
					sum += (count * (count + 1)) / 2;
				}
			}
			array[i] = sum;
		} 
		
		for(int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}
}

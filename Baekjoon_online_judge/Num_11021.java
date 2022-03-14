import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] sum = new int[count];
		int x = 0;
		int y = 0;
		for (int i = 0; i < count; i++) {
			 x = sc.nextInt();
			 y = sc.nextInt();
			 sum[i] = x+y;
		}
		for(int i = 0; i < count; i++) {
			System.out.printf("Case #%d: %d \n", i+1, sum[i]);
		}
	}
}

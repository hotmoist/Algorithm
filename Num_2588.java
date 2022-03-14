import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = x * (y % 10);
		int b = x * (y % 100 - y%10 )/10;
		int c = x * (y - y%100)/100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a + b*10 + c*100);
		
	}
}

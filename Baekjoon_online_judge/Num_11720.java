import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		
		int digitOfNumber = scan.nextInt();
		
		
		String number = scan.next();
		
		
		
		for(int i = 0; i < digitOfNumber; i++) {
			sum = sum + (number.charAt(i) - 48);
		}
		
		System.out.print(sum);
    }
}

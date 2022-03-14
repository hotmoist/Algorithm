import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int a, b, c;
		int sum;
		String stringSum;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		sum = a*b*c;
        stringSum = "" + sum;
		for(int num = 48; num <= 57; num ++) {
			int count = 0;
			for(int compare = 0; compare < stringSum.length(); compare++ ) {
				if (stringSum.charAt(compare) == num) {
					++count;
				}
			}
			System.out.println(count);
		}
		
		
	
	}

}

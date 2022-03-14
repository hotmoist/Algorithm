import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		int digit = 0;
		
		if (num < 100) {
			count = num;
		} else if (num >= 100) {
			count += 99;
			
			for (int i = 111; i <= num; i++) {
				String n = Integer.toString(i);
				digit = n.length();
				
				for(int j = 0; j < digit-2; j++) {
					int sub = n.charAt(0) - n.charAt(1);
					if ((n.charAt(j)-n.charAt(j+1)) == sub && (n.charAt(j+1) - n.charAt(j+2)) == sub){
						if(j == digit -3) {
							++count;
						}
					}
				}
			}
		}
		
		System.out.println(count);
	}

}

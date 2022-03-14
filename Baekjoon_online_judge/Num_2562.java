import java.util.Scanner;

class Main{
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int maxNumber;
		int arrayNumber = 1;
		int[] array = new int[9];
		
		for(int i = 0; i < array.length ; i++ ) {
			array[i] = scan.nextInt();
		}
		
		maxNumber = array[0];
		
		for (int i = 0 ; i < array.length ; i++ ) {
			if (maxNumber < array[i]) {
				maxNumber = array[i];
				arrayNumber = i + 1;
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(arrayNumber);
		
	}
}

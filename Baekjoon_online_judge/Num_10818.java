import java.util.Scanner;

class Main{
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size;
		int[] array;
		
		int maxNumber;
		int minNumber;
		
		size = scan.nextInt();
		
		array = new int[size];
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		//search min number
		minNumber = array[0];
		for(int i = 0; i < array.length; i++) {
			if(minNumber > array[i]) {
				minNumber = array[i];
			}
		}
		
		System.out.println(minNumber);
		
		maxNumber = array[0];
		for (int i = 0; i < array.length; i++ ) {
			if(maxNumber < array[i]) {
				maxNumber = array[i];
			}
		}
		
		System.out.println(maxNumber);
		
	}
}

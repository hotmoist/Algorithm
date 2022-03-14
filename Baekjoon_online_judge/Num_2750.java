import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int size;
		size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			int max = array[0];
			for (int a = 1; a < array.length; a++) {
				int tmp;
				if (max > array[a]) {
					tmp = array[a];
					array[a] = max;
					array[a - 1] = tmp;
				} else if (max < array[a]) {
					max = array[a];
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
    }
}

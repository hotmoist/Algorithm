import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int[] arr = new int[8];
		int decide;
		boolean isAscending = false;
		boolean isDescending = false;
		boolean isMixed = false;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < arr[i+1]) {
				isAscending = true;
			} else {
				isAscending = false;
				break;
			}
		}
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] > arr[i+1]) {
				isDescending = true;
			} else {
				isDescending = false;
				break;
			}

		}
		if (isAscending == false && isDescending == false) {
			isMixed = true;
		}

		if (isAscending == true) {
			System.out.println("ascending");
		} else if (isDescending == true) {
			System.out.println("descending");
		} else if (isMixed == true) {
			System.out.println("mixed");
		}

    }
}

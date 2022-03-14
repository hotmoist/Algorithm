import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		String number;
		int[] arr;
		number = scan.next();
		arr = new int[number.length()];
		for(int i = 0; i < number.length(); i++) {
			arr[i] = number.charAt(i) - 48;
		}
		
		for(int a = 0; a < arr.length; a++) {
			int min = arr[0];
			for(int b = 1; b < arr.length; b++) {
				int tmp;
				if(min < arr[b]) {
					tmp = arr[b];
					arr[b] = min;
					arr[b-1] = tmp;
				} else if (min > arr[b]) {
					min = arr[b];
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a);
		}
		
        
    }
}

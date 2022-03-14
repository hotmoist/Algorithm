import java.util.*;
class Main{
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
	        int n;
	        n = sc.nextInt();
	        int a = n;
	        for(int i=0; i < n; i++, a--) {
	        	for(int j = 0; j < i ; j ++) {
	        		System.out.print(" ");
	        	}
	        	for(int k = 0; k < a ; k++) {
	        		System.out.print("*");
	        	}
	        	

        		System.out.println();
	        	}
	        
    }
}

import java.util.*;
class Main{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
	        int n;
	        n = sc.nextInt();
	        int a = n;
	        for(int i=0; i < n; i++, a--) {
	        	for(int j = 0; j < a ; j ++) {
	        		System.out.print("*");
	        	}
	        	
	        	

        		System.out.println();
	        	}
    }
}

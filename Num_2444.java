import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n;
		int b = 1;
		
		n = sc.nextInt();
		int a = n;
		
		for(int z = 0; z < n ; z ++, a--, b++) {
				for (int y = 1; y < a; y++ ) {
					System.out.print(" ");
					}
			
				for (int x = 1; x < (2 * b); x++) {
						System.out.print("*");
						
					
					}
			
			System.out.println("");
			}
		
		int c = 1;
		int d = n;
		for(int v = 1; v < n; v++, c++, d--) {
			for(int w = 0; w < c; w++) {
				System.out.print(" ");
				}
			
			for(int u = 1; u < (2 * d - 
					2 ); u++) {
		
				System.out.print("*");
			}
			System.out.println("");
        }
    }
}

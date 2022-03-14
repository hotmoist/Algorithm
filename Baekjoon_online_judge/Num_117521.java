import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		String sentance = scan.next();
		int count = 0;
		for(int i =0; i < sentance.length(); i++) {
			if ( i% 10 == 9) {
				System.out.println(sentance.substring(i - 9, i+1));
                ++count;
            }
        }
        System.out.println(sentance.substring(10*count));
        
    }
}

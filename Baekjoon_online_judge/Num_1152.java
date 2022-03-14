import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
		String sentance;
		int count;
		
		sentance = scan.nextLine();
		
		if(sentance.charAt(0) == ' ') {
			sentance = sentance.trim();
			count = 0;
			if(sentance.length() > 0) {
				count = 1;
			}
		}
		else {
			sentance = sentance.trim();
            count = 1;
		}
		
		for(int i = 0 ; i < sentance.length(); i++) {
			char compare;
			compare = sentance.charAt(i);
			if(compare == ' ') {
				++count;
			}
		}
		System.out.println(count);
	
    }
}
            
        

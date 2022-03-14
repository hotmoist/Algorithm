import java.util.Scanner;
class Main{
    public static void main(String args[]){
       	Scanner scan = new Scanner(System.in);
		int stringToIntWord;
		String word = scan.next();
		
		stringToIntWord = word.charAt(0);
		System.out.println(stringToIntWord);
    }
}

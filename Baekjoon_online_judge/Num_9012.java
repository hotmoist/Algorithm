import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rep = scan.nextInt();
		int count = 0;
		String[] yesNo = new String[rep]; 
		MyStack stack;
		
		for(int a = 0; a < rep; a++) {
			String word = scan.next();
			stack = new MyStack();
			count = 0;
			for(int b = 0; b < word.length(); b++) {
				if(word.charAt(b) == '(') {
					stack.push(1);
					++count; 
				} else if(word.charAt(b) != '(' && stack.isEmpty()){
					--count;
					continue;
				} else {
					--count;
					stack.pop();
				}
			}
			
			if (stack.isEmpty() && count == 0) {
				yesNo[a] = "YES";
			} else {
				yesNo[a] = "NO";
			}
		}
		
		for(int i = 0; i < rep; i++) {
			System.out.println(yesNo[i]);
		}
	}
}

class MyStack{
	
	private ArrayList<Integer> ar;
	private char data;
	private int index = 0;
	
	MyStack(){
		ar = new ArrayList<>();
	}
	
	boolean isEmpty(){
		return index == 0;
	}
	
	void push(int data) {
		ar.add(data);
		++index;
	}
	
	int pop() {
		int tmp = ar.remove(index-1);
		--index;
		return tmp;
	}
	
	
}

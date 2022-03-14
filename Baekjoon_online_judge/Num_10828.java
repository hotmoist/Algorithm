import java.util.Scanner;


public class Main{
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack();
		int rep;
		int data;
		String command;
		
		rep = scan.nextInt();
		
		for(int i = 0; i < rep; i++) {
			command = scan.next();
			
			if (command.equals("push")) {
				data = scan.nextInt();
				stack.push(data);
			}
			else if ( command.equals("pop")) {
				stack.pop();
			}
			else if (command.equals("size")) {
				stack.size();
			}
			else if (command.equals("empty")) {
				stack.empty();
			}
			else if( command.equals("top")) {
				stack.top();
			}
			
		}
		
		
	}
}

class Stack{
	
	private Node top;
	private int size = 0;
	
	void empty() {
		if (size == 0) {
			System.out.println(1);
		} else 
			System.out.println(0);
	}
	
	void push(int data) {
		top = new Node(data, top);
		size++;
	}
	
	void size() {
		System.out.println(size);;
	}
	
	void pop() {
		if( size == 0) {
			System.out.println(-1);
		} else {
			System.out.println(top.data);
			top = top.next;
			--size;
		}
	}
	
	void top() {
		if(size == 0) {
			System.out.println(-1);
		}else {
			System.out.println(top.data);
		}
	}
	
	private class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		
	}
}

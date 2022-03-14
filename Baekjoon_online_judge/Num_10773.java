import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		MyStack stack = new MyStack(count);

		for (int i = 0; i < count; i++) {
			int a = sc.nextInt();
			if (a == 0) {
				stack.pop();
			} else {
				stack.push(a);
			}
		}
		
		System.out.println(stack.sum());
	}

}

class MyStack {
	private int[] ar;
	private int size;

	MyStack(int size) {
		ar = new int[size];
		this.size = 0;
	}

	int pop() {
		int tmp = ar[size];
		ar[size] = 0;
		--size;

		return tmp;
	}

	void push(int data) {
		ar[size] = data;
		++size;
	}

	int sum() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += ar[i];
		}

		return sum;
	}
}

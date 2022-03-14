import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		int count = sc.nextInt();
		sc.nextLine();
		String tic = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(tic);
		
		while(st.hasMoreTokens()) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < count; i++) {
			int tmp = queue.remove();
				if(tmp == 0) {
				list.add(i+1);
			}else {
				list.add(list.size()-tmp, i+1);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
	}
}

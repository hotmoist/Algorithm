import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		HashSet<Integer> set = new HashSet<>(); 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 10; i++) {
			int a = Integer.parseInt(bf.readLine());
			
			a %= 42;
			
			set.add(a);
		}
		
		System.out.println(set.size());
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			int rep = Integer.parseInt(bf.readLine());

			for (int i = 0; i < rep; i++) {
				String s = bf.readLine();
				StringTokenizer st = new StringTokenizer(s);

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				int c = a +b;
				bw.write( c + "\n");
			}
			bw.flush();

			bw.close();
	}
}

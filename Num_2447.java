import java.util.Arrays;
import java.io.*;

public class Main  {
	static String[][] star;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		star = new String[n][n];
		rec(0, 0, n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(star[i][j] == null) {
					bw.write(" ");
				} else {
					bw.write(star[i][j]);
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

	private static void rec(int y, int x, int n) {
		if (n == 3) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(i == 1 && j == 1) {
						continue;
					}
					star[y + i][x + j] = "*";
				}
			}
		} else {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(i == 1 && j == 1) {
						continue;
					}
					rec(y + (i*(n/3)), x + (j*(n/3)), n/3);
				}
			}
		}
	}
}

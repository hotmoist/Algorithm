import java.util.Scanner;

public class Main {
	public static void main(String args[])  {
		Scanner scan = new Scanner(System.in);
		int rep = scan.nextInt();
		float[] average = new float[rep];
		
		
		scan.nextLine();
		for (int i = 0; i < rep; i++) {
			String s = scan.nextLine();
			String[] a = s.split(" ");
			
			
			int num = Integer.parseInt(a[0]);
			int count = 0;
			float sum = 0;
			float avg = 0;
			
			for(int j = 1; j < a.length; j++) {
				sum += Integer.parseInt(a[j]);
			}
			
			sum /= num;
			
			for(int j =1; j < a.length; j++) {
				if(Integer.parseInt(a[j]) > sum ) {
					++count;
				}
			}
			avg =((float)count/num )* 100;
			average[i] = avg;
		}
		
		for(float f : average) {
			System.out.printf("%.3f"  ,f);
			System.out.println("%");
		}
	}
}

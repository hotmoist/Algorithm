import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int[] studentScore = new int[5];

		for(int i = 0; i < studentScore.length; i++) {
			studentScore[i] = scan.nextInt();
		}
		for(int i = 0; i < studentScore.length; i++ ) {
			if(studentScore[i] < 40 ) {
				studentScore[i] = 40;
			}
		}
	
		int sum = 0;
		for(int i =0; i <  studentScore.length; i++) {
			sum += studentScore[i];
		}
		
		int average = sum / 5;
		System.out.println(average);
		
    }
}

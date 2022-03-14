import java.util.Scanner;

class Main{
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numOfSubject = scan.nextInt();
		double subjectScoreArr[] = new double[numOfSubject];
		double newSubjectScoreArr[] = new double[numOfSubject];
		double maxScore = 0;
		double sum = 0;
		double average;
		
		for (int i = 0; i < subjectScoreArr.length; i++ ) {
			subjectScoreArr[i] = scan.nextInt();
		}
		for(int i = 0; i < subjectScoreArr.length; i++) {
			if ( subjectScoreArr[i] > maxScore )
				maxScore = subjectScoreArr[i];
		}
		for(int i = 0; i < newSubjectScoreArr.length; i++ ) {
			newSubjectScoreArr[i] = subjectScoreArr[i] / maxScore * 100; 
			sum += newSubjectScoreArr[i];
		}
		
		average = sum / numOfSubject;
		System.out.println(average);
    }
}

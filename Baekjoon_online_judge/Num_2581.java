import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] numberInValue;
		ArrayList<Integer> primeNumberArr = new ArrayList<>();
		int M = scan.nextInt();
		int N = scan.nextInt();
		int size = N - M +1;
		numberInValue = new int[size];
		
		for(int i = 0; i < numberInValue.length; i++) {
			if(M > N) {
				break;
			}
			numberInValue[i] = M;
			M ++;
			}    
        
        for(int i = 0; i < numberInValue.length; i++) {
			int countOfDivid = 0;
			if (numberInValue[i] == 1) {
				continue;
			}
			for(int k = 1; k < numberInValue[i]; k++) {
				
				if(numberInValue[i] % k == 0) {
					++countOfDivid; 
				}
			}
			if(countOfDivid == 1) {
				primeNumberArr.add(numberInValue[i]);
				++count;
			}
		}
        
        int sum = 0;
        
        if(primeNumberArr.size() == 0) {
			System.out.println(-1);
		}
		else {
			for(int i = 0; i < primeNumberArr.size(); i++) {
				sum += primeNumberArr.get(i);
			}
			System.out.println(sum);
			System.out.println(primeNumberArr.get(0));
		}
        
    }
}

import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
	int[] arr = new int [26];
	//    a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
	//    0  1  2  3  4  5  6  7  8  9 10  11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
	
	for(int i = 0; i < 26; i ++) {
		arr[i] = -1;
	}
	
	String s = scan.next();
	char sChar;
	
	for(int i = 0 ; i < s.length(); i++) {
		sChar = s.charAt(i);
		boolean isCompare = false;
		for(int a = 0; a < i; a++) {
			char compare = s.charAt(a);
			if (sChar == compare) {
				isCompare = true;
			}
		} 
		
		if(isCompare == true) {
			continue;
		}else {
			switch (sChar) {
			case 'a' : arr[0] += i+1; break; case 'b' : arr[1] += i+1; break; case 'c' : arr[2] += i+1; break; case 'd' : arr[3] += i+1; break;
			case 'e' : arr[4] += i+1; break; case 'f' : arr[5] += i+1; break; case 'g' : arr[6] += i+1; break; case 'h' : arr[7] += i+1; break;
			case 'i' : arr[8] += i+1; break; case 'j' : arr[9] += i+1; break; case 'k' : arr[10] += i+1; break; case 'l' : arr[11] += i+1; break;
			case 'm' : arr[12] += i+1; break; case 'n' : arr[13] += i+1; break; case 'o' : arr[14] += i+1; break; case 'p' : arr[15] += i+1; break;
			case 'q' : arr[16] += i+1; break; case 'r' : arr[17] += i+1; break; case 's' : arr[18] += i+1; break; case 't' : arr[19] += i+1; break;
			case 'u' : arr[20] += i+1; break; case 'v' : arr[21] += i+1; break; case 'w' : arr[22] += i+1; break; case 'x' : arr[23] += i+1; break;
			case 'y' : arr[24] += i+1; break; case 'z' : arr[25] += i+1; break;
			}
		
		}
	}
	
		for(int i : arr) {
			System.out.print(i + " ");
		}
    }
}

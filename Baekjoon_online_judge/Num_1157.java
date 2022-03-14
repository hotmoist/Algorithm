import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		String inputString;
		String upperCaseString;
		int [] alph = new int[26];
		inputString = scan.next();
		upperCaseString = inputString.toUpperCase();
		
		for(int i = 0; i < inputString.length(); i++) {
			switch(upperCaseString.charAt(i)) {
			case 'A' : alph[0] ++; break; case 'B' : alph[1]++; break; case 'C' : alph[2]++; break;
			case 'D' : alph[3] ++; break; case 'E' : alph[4]++; break; case 'F' : alph[5]++; break;
			case 'G' : alph[6] ++; break; case 'H' : alph[7]++; break; case 'I' : alph[8]++; break;
			case 'J' : alph[9] ++; break; case 'K' : alph[10]++; break; case 'L' : alph[11]++; break;
			case 'M' : alph[12] ++; break; case 'N' : alph[13]++; break; case 'O' : alph[14]++; break;
			case 'P' : alph[15] ++; break; case 'Q' : alph[16]++; break; case 'R' : alph[17]++; break;
			case 'S' : alph[18] ++; break; case 'T' : alph[19]++; break; case 'U' : alph[20]++; break;
			case 'V' : alph[21] ++; break; case 'W' : alph[22]++; break; case 'X' : alph[23]++; break;
			case 'Y' : alph[24] ++; break; case 'Z' : alph[25]++; break; 
			}
		}
		int max = alph[0];
		int freqAlph = 0;
		
		for(int i = 0; i < alph.length; i++) {
			if ( max < alph[i]) {
				max = alph[i];
				freqAlph = i;
			}
		}
		int sameNumCount = 0;
		for(int i = 0 ; i < alph.length; i++) {
			if (max == alph[i]) {
				sameNumCount++;
			}
		}
		
		if (sameNumCount != 1) {
			System.out.println("?");
		}
		else {
			switch(freqAlph) {
			case 0 : System.out.print("A"); break; case 1 : System.out.print("B"); break; case 2 : System.out.print("C"); break; case 3: System.out.println("D"); break;
			case 4 : System.out.print("E"); break; case 5 : System.out.print("F"); break; case 6 : System.out.print("G"); break; case 7: System.out.println("H"); break;
			case 8 : System.out.print("I"); break; case 9 : System.out.print("J"); break; case 10 : System.out.print("K"); break; case 11: System.out.println("L"); break;
			case 12 : System.out.print("M"); break; case 13 : System.out.print("N"); break; case 14 : System.out.print("O"); break; case 15: System.out.println("P"); break;
			case 16:  System.out.print("Q"); break; case 17 : System.out.print("R"); break; case 18 : System.out.print("S"); break; case 19: System.out.println("T"); break;
			case 20 : System.out.print("U"); break; case 21 : System.out.print("V"); break; case 22 : System.out.print("W"); break; case 24: System.out.println("X"); break;
			case 25 : System.out.println("Z"); break;
			}
		}
		
    }
}

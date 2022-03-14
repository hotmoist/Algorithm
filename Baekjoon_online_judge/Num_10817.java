import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int A, B, C;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		if (A>=B && B>=C)
			System.out.println(B);
		else if (A>=C && C>=B)
			System.out.println(C);
		else if (B>=A && A>=C)
			System.out.println(A);
		else if (B>=C && C>=A)
			System.out.println(C);
		else if (C>=A && A>=B)
			System.out.println(A);
		else if (C>=B && B>=A)
			System.out.println(B);
		else 
			System.out.println("수가 잘못 입력되었습니다.");
        
    }
}

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int a = 0; a < n; a++){
            for ( int b = 0; b < a; b++){
                System.out.print(" ");
            }
            for ( int c = 0; c < 2 *(n - a) -1; c++){                
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int d = 0; d < n-1; d++){
            for (int e = 0; e < n-2-d; e++){
                System.out.print(" ");
            }
            for ( int f = 0; f < 2 * (d +1) +1; f++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
}

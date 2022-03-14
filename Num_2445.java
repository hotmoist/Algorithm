import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        
        for (int a =0; a< n; a++){
            for ( int b = 0; b < a+1; b++){
                System.out.print("*");
            }
        for (int c = 0; c < 2 *(n - a -1); c++){
            System.out.print(" ");
            }
        for (int d = 0; d < a+1; d++){
            System.out.print("*");
        }
        System.out.println();
        }
        
        for (int e = 0; e < n - 1; e++){
            for(int f = 0; f < n-1-e; f++){
                System.out.print("*");
            }
            for (int g = 0; g < 2 * e + 2; g++){
                System.out.print(" ");   
            }    
            for (int h = 0; h < n-1-e; h++){
                System.out.print("*");
            }    
        System.out.println();
        }
    }
}

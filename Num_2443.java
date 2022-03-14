import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int a = 0; a < n; a ++){
            for (int b= 0; b < a; b++ ){
                System.out.print(" ");
            }
            for (int c = 0; c < 2 *(n - a)-1; c++){
                System.out.print("*");
              }
            System.out.println();
        }
    }
}

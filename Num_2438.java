import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int x = 1;
        for(int a = 0; a < n ; a++, x++){
            for(int b = 0; b< x; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

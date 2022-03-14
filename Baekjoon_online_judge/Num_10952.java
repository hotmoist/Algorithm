import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
        int a, b; 
        
        do{
            a = scan.nextInt();
            b = scan.nextInt();
            
            if(a == 0 && b == 0){
                break;
            } else {
                System.out.println(a+b);
            }
            
        } while (a >0 && b < 10);
    }
}

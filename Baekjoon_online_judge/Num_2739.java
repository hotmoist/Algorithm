import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, sum;
        num = sc.nextInt();
       
        for(int multi = 1; multi <=9; multi ++ ){
            sum = num * multi;
            System.out.println(num +" * " + multi +" = " + sum);
        }
    }
}

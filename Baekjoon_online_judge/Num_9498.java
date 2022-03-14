import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testScore;
        testScore = sc.nextInt();
        
        if (testScore >= 90)
            System.out.print("A");
                else  
                    if(testScore >= 80 )
                    System.out.print("B");
                        else 
                            if (testScore>=70 )
                                System.out.print("C");
                            else 
                                if(testScore>=60)
                                System.out.print("D");
                                else 
                                    System.out.print("F");
                                    
                                
                            
                   
        
    }
}

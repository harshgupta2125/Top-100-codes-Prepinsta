import java.util.*;
public class fibonacciSeries {
        public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the range: ");
        int range= sc.nextInt();
        System.out.print("The Fibonacci Series Upto " +range+" is: "); 
        System.out.print(a+"  ");
        System.out.print(b+"  ");

        for(int i=2; i<=range; i++){
            
            int c= a+b;
            a=b;
            b=c;
            System.out.print(c+"  ");
        }    
    }
}

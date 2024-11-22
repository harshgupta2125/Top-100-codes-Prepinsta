import java.util.*;
public class primeFactorOfNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("Prime factors are : ");
        for(int i=2; i*i<=num; i++){
            while(num%i==0){
                System.out.println(i);
                num/=i;
            }
        }
        if(num>1)
            System.out.println(num);
    }
}
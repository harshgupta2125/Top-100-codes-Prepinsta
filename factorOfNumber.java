import java.util.*;
public class factorOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("factors are : ");
        for(int i=1; i<=num; i++){
            if(num%i==0)
               System.out.println(i);
        }
    }
}
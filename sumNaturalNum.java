import java.util.*;
public class sumNaturalNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0; i<=num; i++){
            sum= sum+i;
        }
        System.err.println("Sum of "+num+ " Natural numbers:"+ sum);
    }
}

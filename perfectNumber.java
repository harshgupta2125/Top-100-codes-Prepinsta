import java.util.*;
public class perfectNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int i=1;
        while (i < num) {
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum == num){
            System.out.println("It is a perfect Number");
        } else {
            System.out.println("It is not a perfect Number");
        }
    }
}
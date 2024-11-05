import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num= 1577;
        int sum=0;
        int temp = num;
        while (num!=0) {
            int digit = num % 10;
            sum += (int)Math.pow(digit, 3);
            num /= 10;
        }   
        if(temp==sum){
            System.out.println("it's an armstrong number");
        }
        else{
            System.out.println("it's not an armstrong number");

        }
    }
}
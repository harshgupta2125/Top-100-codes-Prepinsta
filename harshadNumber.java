import java.util.*;
public class harshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (isHarshad(n)) {
            System.out.println(n + " is a Harshad number");
        } else {
            System.out.println(n + " is not a Harshad number");
        }
        
        
    }
    public static boolean isHarshad(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }
    return n % sum == 0;
}
}
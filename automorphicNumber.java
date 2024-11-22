import java.util.*;
public class automorphicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int n = num;
        int square = n * n;
        String str = Integer.toString(n);
        String str1 = Integer.toString(square);
        if(str1.endsWith(str))
        {
            System.out.println(n + " is an automorphic number");
        }
        else
        {
            System.out.println(n + " is not an automorphic number");
        }
    }    
}

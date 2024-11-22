import java.util.Scanner;
public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        double base= sc.nextInt();
        System.out.print("Enter the Exponent: ");
        double expo= sc.nextInt();
        double result= Math.pow(base, expo);            //using Math.pow prebuilt function
        System.out.println(result);

    }
}

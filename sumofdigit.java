public class sumofdigit {
    public static void main(String args[]) {
        int num = 3338;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digits is " + sum);
    }
}
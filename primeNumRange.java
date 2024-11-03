public class primeNumRange {
    public static void main(String[] args) {
        int a= 10;
        int num = 30;

        System.out.println("Prime numbers between "+a+" and " + num + " are:");
        for (int i = a; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
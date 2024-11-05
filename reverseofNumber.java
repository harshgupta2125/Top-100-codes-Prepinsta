public class reverseofNumber{
    public static void main(String[] args) {
        int num= 123;
        int reverse=0;
        int rem= 0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        System.out.println(reverse);
    }
}
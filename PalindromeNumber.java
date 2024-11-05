public class PalindromeNumber{
    public static void main(String[] args) {
        int reverse=0, rem;
        int num= 5885;
        int originalNum = num;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        if(originalNum == reverse){
            System.out.println("Yes this is palindrome ");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
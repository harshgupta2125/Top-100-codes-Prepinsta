import java.util.*;
public class perfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isPerfectSquare = false;
        int i = 1;
        while(i * i <= num){
            if(i * i == num){
                isPerfectSquare = true;
                break;
            }
            i++;
        }
        if(isPerfectSquare){
            System.out.println("Yes it is a perfect square");
        }
        else{
            System.out.println("No it is not a perfect square");
        }
    }
}
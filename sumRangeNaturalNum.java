public class sumRangeNaturalNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 40; 
        int sum =0;
        for(int i=a; i<=b; i++){
            sum= sum+i;
        }
        System.err.println("Sum of "+a+" to "+b+ " Natural numbers:"+ sum);
    }
}

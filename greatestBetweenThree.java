public class greatestBetweenThree {
    public static void main(String[] args) {
        int a= 77;
        int b= 55;
        int c= 98;
        if(a>b && a>c){
            System.out.println("Greatest between a, b and c is "+ a);
        }
        else if(b>a && b>c){
            System.out.println("Greatest between a, b and c is "+ b);
        }
        else if(c>a && c>b){
            System.out.println("Greatest between a, b and c is "+ c);
        }
    }
}

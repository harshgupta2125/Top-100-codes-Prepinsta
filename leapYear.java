public class leapYear {
    public static void main(String[] args) {
        int year= 2024;
        if(year%4==0 || year%400==0){
            System.err.println(year+" is Leap year");
        }
        else{
            System.out.println(year+" is not a Leap year");
        }
    }
}

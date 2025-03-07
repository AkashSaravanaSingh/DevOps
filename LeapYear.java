import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        if(i%400==0 || i%4==0 && i%100!=0){
            System.out.print(i + " is a Leap Year!");
        }
        else{
            System.out.print(i + " is not a Leap Year!");
        }
    }
}
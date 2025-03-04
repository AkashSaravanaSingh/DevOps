import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no.of values : ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter the values :");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
            sum+=arr[i];
        }
        System.out.print("Sum : "+ sum);
    }
}

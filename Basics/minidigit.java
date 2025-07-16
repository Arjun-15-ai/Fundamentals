import java.util.*;
public class minidigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : " );
        int num = sc.nextInt();
        int min = num%10;

        while (num > 0) {
            int  digit = num % 10; 
            
            if (digit < min) {
               
                min = digit; 
            }
            num = num / 10;
        }

        System.out.println("Minimum digit: " + min);
    }
}

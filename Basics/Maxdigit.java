import java.util.*;
public class Maxdigit
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num=sc.nextInt();
    int max=0;
    int min=num%10;
    while(num>0){
        int digit=num%10;
        if(digit>max){
            max=digit;
        }
        num=num/10;
    }
    System.out.println( " maximum digti is : " + max);
	}
}
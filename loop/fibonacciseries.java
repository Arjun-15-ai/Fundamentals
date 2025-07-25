import java.util.*;
class fibonacciseries{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int len =sc.nextInt();
int n1=0;
int n2=1;
int nextnum;
for(int i=0;i<=len;i++){
System.out.println(n1);  // 0 1 1 2 3 5 
nextnum=n1+n2; // 1 2 3  5 8
n1=n2;// 1 1 2 3 5
n2=nextnum;// 1 2 3 5 8
 
}
}
}
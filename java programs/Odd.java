//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class Odd{
    public static void OddSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
            {
                sum=sum+i; 
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OddSum(n);
        
    }
}
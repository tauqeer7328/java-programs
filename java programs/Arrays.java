import java.util.*;
public class Arrays {
    public static void main(String [] args){
        int item=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int number[]=new int[n];
        for(int i=0;i<n;i++){
        number[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(number[i]==item){
             System.out.println("number is found at "+ i +" location");
             break;
            }
        }
    }
    
}

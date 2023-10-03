import java.util.*;
public class ReverseArray{
    public static void Reverse(int a[]){
        int s=0,last=a.length-1;
        while(s<last){
            int temp=a[last];
            a[last]=a[s];
            a[s]=temp;
            s++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the size of Array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Reverse(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
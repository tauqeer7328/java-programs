import java.util.*;
public class Appears {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
           
        System.out.println(containsDuplicats(a,n));
    }
    public static boolean containsDuplicats(int[] a, int n) {
        for(int i=0; i<n-1 ; i++) { 
               for(int j=i+1; j<n ; j++ ) { 
                    if( a[i] == a[j] ) { 
                            return true;
                      } 
                } 
          } 
             return false;
}
}

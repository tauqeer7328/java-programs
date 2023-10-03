import java.util.*;
public class BubbleSort {
    public static void BubbleSorting(int arr[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [100];
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSorting(arr, n);
        print(arr, n);
    }
    
}

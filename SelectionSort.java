import java.util.*;
public class SelectionSort {
    public static void selectionSorting(int arr[], int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
        selectionSorting(arr, n);
        print(arr, n);
    }
    
}

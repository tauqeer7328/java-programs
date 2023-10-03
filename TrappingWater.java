import java.util.*;
public class TrappingWater{
    public static void TrapperWater(int a[], int n){
        int leftMax[]=new int[n];
        int rightMax[]=new int [n];
        leftMax[0]=a[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(a[i],leftMax[i-1]);
        }
        rightMax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(a[i],rightMax[i+1]); 
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int Waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=Waterlevel-a[i];
        }
        System.out.println(trappedWater);
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
        TrapperWater(a,n);
        }
    }
import java.util.Scanner;
public class Addition {
    public static void main(String args[])
    {
    int a,b,sum;
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    sum=a+b;
    System.out.print("sum of "+ a +" and "+ b +" is "+sum);
}
}

import java.util.Scanner;
public class Arthmetic {
    public static void main(String [] args)
    {
        int a,b,c;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum of "+ a +" and "+ b +" is "+c);
        c=a-b;
        System.out.println("subtract of "+ a +" and "+ b +" is "+c);
        c=a*b;
        System.out.println("multiple of "+ a +" and "+ b +" is "+c);
        c=a/b;
        System.out.println("division of "+ a +" and "+ b +" is "+c);
        c=a%b;
        System.out.println("modulus of "+ a +" and "+ b +" is "+c);
    }
    
}

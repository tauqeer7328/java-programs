//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class Circumference{
    public static void CircumferenceOfRadius(int radius){
        double circle= (2*3.14*radius);
        System.out.println(circle);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=sc.nextInt();
        CircumferenceOfRadius(radius);
    }
}
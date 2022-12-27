//compare number
import java.util.*;
public class Conditionif2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("A is equal to B");
        }
        else if(a>b)
        {
            System.out.println("A is greater than B");
        }
        else
        {
            System.out.println("A is lesser than B");
        }
    }    
}

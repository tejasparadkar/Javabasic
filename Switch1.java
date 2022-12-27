//Calculator
import java.util.*;
public class Switch1 
{
    public static void main(String args[])
    {
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        System.out.println("Enter a choice between 1-4, 1-Addition,2-Subtraction,3-Multiplication,4-Division");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
            {
                res = a+b;
                System.out.print("Addition is "+res);
                break;
            }
            case 2:
            {
                res = a-b;
                System.out.print("Subtraction is "+res);
                break;
            }
            case 3:
            {
                res = a*b;
                System.out.print("Multiplication is "+res);
                break;
            }
            case 4:
            {
                res = a/b;
                System.out.print("Division is "+res);
                break;
            }
            default:
            {
                System.out.print("Enter correct choice");
                break;
            }
        }
    }
}

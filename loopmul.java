//multiplication till 10 of a specified number
import java.util.*;
public class loopmul {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        for(int i=1;i<11;i++)
        {
            int mul=a*i;
            System.out.println(a+" x " +i+" = " +mul);
        }
    }
}

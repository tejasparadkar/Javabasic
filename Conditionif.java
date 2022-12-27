//Check Adult or not
import java.util.*;
public class Conditionif {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int a = sc.nextInt();
        if(a > 18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        }
    }
}

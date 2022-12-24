// find out the negative positive and zero integers...
import java.util.Scanner;
public class posneg
{
    public static void main(String[] args) 
    {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter any integer");
        int integer = pma.nextInt();
        if(integer<0)
        System.out.println("the integer is negative");
        else if (integer>0)
        System.out.println("the number is positive ");
        else 
        System.out.println("the integer is zero ");
    }
}

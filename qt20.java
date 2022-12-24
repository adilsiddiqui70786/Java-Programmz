//USE OF ADD , SUB , MULTIPLY , DIVIDE AND MOD...
import java.util.Scanner;
public class qt20 
{
    public static void main(String[] args) 
    {
        Scanner pma =new Scanner(System.in);
        float a,b;
        a= pma.nextFloat();
        b= pma.nextFloat();
        System.out.println();
        System.out.println("enter two integer is " +a+ " and " +b);
        System.out.println(+a+ " + " +b+ " = " +(a+b));
        System.out.println(+a+ " - " +b+ " = " +(a-b));
        System.out.println(+a+ " * " +b+ " = " +(a*b));
        System.out.println(+a+ " / " +b+ " = " +(a/b));
        System.out.println(+a+ " % " +b+ " = " +(a%b));
    }
}   

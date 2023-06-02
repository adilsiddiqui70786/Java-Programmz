// comissions......
import java.util.Scanner;
public class commision
{
    public static void main(String[] args) 
    {
        Scanner  pma = new Scanner(System.in);
        System.out.println("enter the sales = ");
        int sale = pma.nextInt();
        double commision ;
        if(sale>=25000)
        {
            commision = (sale*5)/100;
            System.out.println("commission = " +commision + "Rs..");
        }
        {
            commision = (sale*7/100);
            System.out.println("commission = " +commision + "Rs..");
    }   }
}

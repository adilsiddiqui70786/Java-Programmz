// sales and commission ....
import java.util.Scanner;
public class sale{
    public static void main(String[] args) 
    {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the sales = ");
        int sales = pma.nextInt();
        double commision;
        if(sales>25000)
        {
            commision = (sales*5)/100;
            System.out.println("the commission is:" +commision);
        }
        else if(sales>25001 && sales<50000)
        {
            commision = (sales*7)/100;
            System.out.println("the commission is:" +commision);
        }
        else if(sales> 50001 && sales<75000)
        {
            commision = (sales*8)/100;
            System.out.println("the commission is :" +commision);
        }
        else 
        {
            commision = (sales*10)/100;
           System.out.println("the commision is :" +commision);
       }
      }  
}


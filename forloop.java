import java.util.Scanner;
public class forloop{
  
             public static void main (String args[])
{
 
              int num;
              System.out.println("Enter the number : ");
              Scanner pma = new Scanner(System.in);
              num = pma.nextInt();
              
             for(int i=1; i<=10;i++)
             {
                System.out.println(num*i);
             }
}
}
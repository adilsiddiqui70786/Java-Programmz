
import java.util.Scanner;
class whileloop{

     public static void main (String [] args)
        {

           int num;
           System.out.println("Enter the number :");
           Scanner pma = new Scanner (System.in);
           num = pma.nextInt();
      
  while(num >= 0 )
  {
    
         if(num%2==0)
         {
             System.out.println("Number is Even");
             break;
         }

   else 
        {
           System.out.println("Number is Odd");
           break;
        }
  }

}
}

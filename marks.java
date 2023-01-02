import java.util.Scanner;

public class marks 
{
    public static void main(String[] args) 
    {
     System.out.println("Enter the mark of three subject....");
     Scanner pma = new Scanner(System.in);
      int sub1 = pma.nextInt();
      int sub2 = pma.nextInt();
      int sub3 = pma.nextInt();
      int average = (sub1+sub2+sub3)/3;
      System.out.println("Average"  +average);
      if(average>=33)
      System.out.println("Student is pass");
      else
      System.out.println("Student is fail");`
    }
}

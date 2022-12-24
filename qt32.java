// GRADE OF STUDENT FIRST,SECOND THIRD DIVISION OR FAIL
import java.util.Scanner;
public class qt32
{
     public static void main(String[] args) 
     {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter marks in three subject:");
        int a = pma.nextInt();
        int b= pma.nextInt();
        int c = pma.nextInt();
        int average = (a+b+c)/3;
        double division;
        if (average>=60)
        System.out.println("first division");
        else if (average>=45 && average<=60)
        System.out.println("second division");
        else if(average>=33 && average<=45)
        System.out.println("third division");
        else 
        System.out.println("fail");
    }
       
}

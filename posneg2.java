// FORCE THE USER TO ENTER ANY POSITIVE VALUE...
import java.util.Scanner;
public class posneg2 {
     public static void main(String[] args) 
    {
     Scanner pma = new Scanner(System.in);
     {
     System.out.println("Enter any positive number :");
     int n = pma.nextInt();
     for(n=0;n>=0;n++)
     System.out.println("Positive value...");
    }
     System.out.println("Don't enter any negative number..");
    }
}


//sqaure and cube of numbers...
import java.util.Scanner;
public class sqrcbe2 
{
 public static void main(String[] args) 
 {
    Scanner pma = new Scanner(System.in);
    System.out.println("Enter any integer = ");
    int num = pma.nextInt();
    if(num<5)
    {
        double square = num*num;
        System.out.println("square of " +num + "is" +square);
    }
    else
    {
        double cube = num*num*num;
        System.out.println("cube of" +num+ "is" +cube);
    }   
 }
}

//CHECK THE NUMBER IS EVEN OR NOT..
import java.util.Scanner;
public class oddeven 
{  public static void main(String[] args) 
    {
        System.out.println("Enter the integer numberz :");
        Scanner pma = new Scanner(System.in);
        int num = pma.nextInt();
        if(num%2==0)
        System.out.println("the integer is even");
        else
        System.out.println("the number is odd ");
    }
}

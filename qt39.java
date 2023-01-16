//limited integer and out of range.....
import java.util.Scanner;
public class qt39
{ 
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter any ineteger from 1-3");
        int n = pma.nextInt();
        if(n==1)
        System.out.println("one");
        else if (n==2)
        System.out.println("two");
        else if (n==3)
        System.out.println("three");
        else 
        System.out.println("It gives message out of range..");
    }
}

//CHECK THE CODE IS CORRECT OR WRONG...
import java.util.Scanner;
public class rightwrong {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the correct code :");
        int integer = pma.nextInt();
        if(integer == 5 || integer == 7 || integer == 11 || integer == 24)
        System.out.println("Right code ");
        else 
        System.out.println("Wrong code");
    }
}

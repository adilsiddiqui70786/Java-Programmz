// CHECK THE INTEGER IS RIGHT OR WRONG..
import java.util.Scanner;
public class rightwrong2 {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the integer code :");
        int integer = pma.nextInt();
        if(integer>=5 && integer <=24)
        System.out.println("Right code..");
        else
        System.out.println("Wrong code ...");
    }
}

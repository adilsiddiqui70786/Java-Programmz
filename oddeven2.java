// PRINT ODD & EVEN USING THE CONDITIONAL OPERATOR...
import java.util.Scanner;
public class oddeven2 {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter any integer..");
        int n = pma.nextInt();
        String str;
        str = (n%2==0)?"Integer is even":"Integer is odd";
        System.out.println(str);
    }
}

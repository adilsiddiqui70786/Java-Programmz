//FIND OUT ADULT OR MINOR WITH CONDITIONAL OPERATOR...
import java.util.Scanner;
public class adult2 {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int p = pma.nextInt();
        String  str;
        str = (p>=18)?"The person is Adult":"The person is Minor";
        System.out.println(str);
    }
}

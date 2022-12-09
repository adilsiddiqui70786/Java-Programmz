// find male female using m and f....
import java.util.Scanner;
public class gender
{
        public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the gender code :");
        char code = pma.nextLine().charAt(0);
        if(code == 'M' || code == 'm')
        System.out.println("Given data is male");
        else if (code== 'F' || code == 'f')
        System.out.println("Given data is female");
        else 
        System.out.println("Wrong code intered");
    }
}
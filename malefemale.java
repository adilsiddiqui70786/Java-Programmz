// CHECK MALE OR FEMALE THROUGH SE CODE
import java.util.Scanner;
public class malefemale {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the se code -");
        char code = pma.nextLine().charAt(0);
        if(code == 'M' || code == 'm')
        System.out.println("Data is male");
        else if (code == 'F' || code == 'f')
        System.out.println("Data is female");
        else 
        System.out.println("Wrong code inserts");
    }
}

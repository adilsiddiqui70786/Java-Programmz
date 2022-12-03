import java.util.Scanner;

public class qt19
{
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("enter principal amount : ");
        float p = pma.nextFloat();
        float r = 12;
        float t = 10;
        float si = (p*r*t)/100;
        System.out.println("simple interest = "  +si);
    }
       //SIMPLE INTEREST OF PRINCIPAL AMOUNT
}

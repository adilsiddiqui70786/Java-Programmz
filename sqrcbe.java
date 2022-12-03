import java.util.Scanner;
public class sqrcbe
{
    public static void main(String[] args)
     {
        Scanner pma = new Scanner(System.in);
        System.out.println("enter any integer :");
        int p = pma.nextInt();
        int m = (p*p);
        int a = (p*p*p);
        System.out.println("square:" +m);
        System.out.println("cube:"+a);
    }
}        //SQUARE OF M AND CUBE OF A

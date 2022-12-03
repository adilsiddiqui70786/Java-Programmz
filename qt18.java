import java.util.Scanner;
public class qt18
{
    public static void main(String[] args)
     {
        Scanner pma = new Scanner(System.in) ;
        System.out.println("enter the two integer :");
        int p = pma.nextInt();
        int m = pma.nextInt();
        int a = p/m;
        System.out.println("number of times first integer can be divided by the second int :" +a);
        int r= p%m;
        System.out.println("it will left :" +r);
    }    
}       
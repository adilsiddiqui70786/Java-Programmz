//commision

import java.util.Scanner;
public class commission2
{
    public static void main(String[] args)
    {
        Scanner pma  = new Scanner(System.in);
        System.out.println("enter the age sale made by any person");
        int sale = pma.nextInt();
        double commission2;
        String str;
        str = (sale>2500)?"(sale*5)/100":"(sale*7)/100";
        System.out.println(str);
    }
}

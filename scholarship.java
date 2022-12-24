//CONDITION TO ELIGIBLE FOR SCHOLARSHIP
import java.util.Scanner;
public class scholarship
{
    public static void main(String[] args) 
    {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter Annual family income and age of a person");
        int income = pma.nextInt();
        System.out.println("Enter the age of the person..");
        int age = pma.nextInt();
        if((income>=100000 && income<=200000) && (age>=18 && age<=24))
        System.out.println("Person is eligible for scholarship..");
        else 
        System.out.println("Person is not eligible for scholarshop..");
    }
   
}

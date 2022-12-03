import java.util.Scanner;

public class adult 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the age of the person : ");
        Scanner pma = new Scanner(System.in);
        int age = pma.nextInt();
        if(age>=18)
        System.out.println("You are an adult..");
        else
        System.out.println("You are minor...");    

    }
                //CHECKING THE ADULT OR NOT...
    
}

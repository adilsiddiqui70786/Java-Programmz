//FOR AVERAGE...
import java.util.Scanner;
public class average{
    public static void main(String[] args) 
    {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter the p and m value :");
        float p = pma.nextInt();
        float m = pma.nextInt();
        float average = (p+m)/2f;
        System.out.println("average" +average);
    }
    
}        

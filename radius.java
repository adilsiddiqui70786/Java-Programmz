import java.util.Scanner;
public class radius 
{
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);  //input from user
        System.out.println("enter the radius of circle :"); //print
        float p = pma.nextFloat();                               //float value
        double pi = 3.14,area;                                 //double 
        area  = pi*(p*p);
        System.out.println("area of circle = " +area);
        
    }   // area of circle
}

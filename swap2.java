import java.util.Scanner;

public class swap2 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("swap the a and b");
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("a="  +a);
        System.out.println("b="  +b);
        
    }    //SWAPPING TWO INTEGER WITHOUT THIRD VARIABLE..
    
}

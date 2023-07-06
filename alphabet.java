//It is Capital alphabet,small alphabet,digit or any other special

 character...

import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        Scanner pma = new Scanner(System.in);
        System.out.println("Enter any character :");
        char alphabet = pma.nextLine().charAt(0);
        if (alphabet>='A'&& alphabet<='Z')
        System.out.println("It is capital alphabet..");
        else if ( alphabet>='a' && alphabet<= 'z')
        System.out.println("It is small alphabet");
        else 
        System.out.println("It is digit or any other special character");
    }
}

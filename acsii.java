//Write a program which enter any character and print its ACSII value..


import java.util.*;
public class acsii
{
    public static void main(String[] args)
    {
        System.out.println("Enter any character :");
        Scanner pma =new Scanner(System.in); 
        char a = pma.next().charAt(0);  
        System.out.println("Acsii value = " +(int)a);  
    } 
     
}
  
 

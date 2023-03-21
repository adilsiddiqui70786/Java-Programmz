import java.util.Scanner;

public class elseif{
public static void main (String args[])
{
   
int marks;
System.out.println("Enter the marks : ");
Scanner pma = new Scanner (System.in);
marks = pma.nextInt();
if (marks>=60 && marks<=100)
{
    System.out.println("First division");
}

else if (marks>=45 && marks<60)

{

    System.out.println("Second division");
}

else if(marks>=33 & marks<45)
{

   System.out.println("Third division");
}

else 

{
System.out.println("Sorry , You failed try again ...");
}

}
}


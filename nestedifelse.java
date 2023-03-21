public class nestedifelse{

       public static void main(String [] args)

{

       int num1 = 20 , num2 =30 ,num3 = 45;
       
       if(num1>num2)
          
        {
           if(num1>num3)
             {
                System.out.println("Greater number = " +num1);
             }

        else 
            {
               System.out.println("Greater number = " +num3);
            }

        }


         else 
           {
               if (num2>num3)
              {
                System.out.println("greater number = " +num2);
              }

         else 
             {
              System.out.println("greater number = " +num3);
             }


}
}
}

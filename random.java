//Taking 10 integers  under (0 , 1000)
import java.util.Random;
public class random {
    public static void main(String[] args) {
        int a;
        Random t = new Random();

        for (a =1; a<=10; a++){
            System.out.println(t.nextInt(1000));

        }
    }
}

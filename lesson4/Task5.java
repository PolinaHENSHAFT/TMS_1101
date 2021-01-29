//Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой. Определите, является ли число четным.
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

      Random rand = new Random();
        int n = rand.nextInt(1000);
        int n1 = n%100;
        int n2 = n1%10;
        int n3 = (n1-n2)/10;
        int n4 = (n-n1)/100;

        if (n<1000) {
            System.out.println("the number n is Three-digit");

        }
          else {
                 System.out.println("the number n is not Three-digit");
          }
         if (n2==7) {
            System.out.println("the Third digit is 7");

        }
          else {
                 System.out.println("the Third digit is not 7");
          }   

        if (n%2==0) {
            System.out.println("the number" + n + " even number");
        } else {
            System.out.println(" the number " + n + " is not even number");
        }


    }

}
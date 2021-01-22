  public class Numreverse {
    public static void main(String[] args) {

       int num = 1972;
       int num1 = num%1000;
       int num2 = num1%100;
       int num3 = num2%10;
       int num4 = (num2-num3)/10;
       int num5 = (num1-num2)/100;
       int num6 = (num-num1)/1000;
        
        System.out.println(num);
        System.out.println(num3+""+num4+""+num5+""+num6);
    }

      
  }


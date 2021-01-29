public class task7 {

    public static void main(String[] args) {

        int a = 6;
        int b = 8;
        int r = 5;
        int r1 = 2*r;
        int a1 = a*a;
        int b1 = b*b;
        int r2 = r1*r1;
        int s = a1+b1;
        
        if (s==r2) {
            System.out.println("The square inside the circle" );
            System.out.println("side1 is" + a);
            System.out.println("side2 is" + b);
            System.out.println("the radius is" + r);
        }
          else {
                 System.out.println("The square not inside the circle");
          }
          
    }
    
}
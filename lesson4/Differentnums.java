import java.util.Random;

public class Differentnums {
	
	public static void main(String[] args) {
	
	Random rand = new Random();
	
    int n1 = rand.nextInt(10)+1;
    int n2 = rand.nextInt(10)+1;  
    int n3 = rand.nextInt(10)+1;
    int n4 = rand.nextInt(10)+1;

	if (n1!=n2 && n1!=n3 && n1!=n4 && n2!=n1 && n2!=n3 && n2!=n4 && n3!=n1 && n3!=n2 && n3!=n4 && n4!=n1 && n4!=n2 && n4!=n3); {     
	     System.out.println(n1+""+n2+""+n3+""+n4);
	  
	}
    	}
  }

    
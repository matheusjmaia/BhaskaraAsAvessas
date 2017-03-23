
package bhaskara;

import java.util.Scanner;


public class Bhaskara {
    public static void main (String[] args) {
      Scanner console = new Scanner (System.in);
      //ENTRADAS
      System.out.println("x1");
      double x1 = console.nextDouble();
      System.out.println("x2");
      double x2 = console.nextDouble();
      System.out.println("c");
      double c = console.nextDouble();
      
      //PROCESSAMENTO
      double s = x1 + x2;
      double p = x1 * x2;
      double a = c / p;
      double b = -(s * a);
      
      //SAIDA
      System.out.println("A equação que tem como raízes " + x1 + " e " + x2 + " é " +a+ " x² + "+ b + "x + "+c );
      
              
      
      
      

    }
    
}

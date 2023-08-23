
package LatihanJavaDasar;

import java.util.Scanner;


public class Latihan4 {
      public static void main(String[] args) {
      Scanner UserInput = new Scanner(System.in);
      System.out.println("==== Operator Komparasi ====");
      int a,b;
      boolean c;
      a = 10;
      b = 10;
      c = (a == b);
      System.out.printf("%d --> %d = %s \n",a,b,c);
      
      System.out.println("\n");
      
      System.out.println("== Operator Logika (Exlusive OR (XOR)) ==");
      boolean x,o,r;
      x = true;
      o = true;
      r = (x ^ o);
      System.out.println(x + " ^ " + o + " = " + r);
      x = true;
      o = false;
      r = (x ^ o);
      System.out.println(x + " ^ " + o + " = " + r);
      x = false;
      o = true;
      r = (x ^ o);
      System.out.println(x + " ^ " + o + " = " + r);
      x = false;
      o = false;
      r = (x ^ o);
      System.out.println(x + " ^ " + o + " = " + r);
      
      
    }
}

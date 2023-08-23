
package LatihanJavaDasar;

import java.util.Scanner;
public class latihan12 {
    public static void main (String[] args){
      Scanner input;  
      float angka1, angka2, hasil;
      String operator;
      input = new Scanner(System.in);
      System.out.println("===== KALKULATOR =====");
      System.out.print("Angka pertama : ");
      angka1 = input.nextFloat(); 
      System.out.print("Operator : ");
      operator = input.next();
      System.out.print("Angka kedua : ");
      angka2 = input.nextFloat();
      
      switch(operator){
        case "+":
            hasil = angka1 + angka2;
            System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
        case "-":
            hasil = angka1 - angka2;
            System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
        case "*":
            hasil = angka1 * angka2;
            System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
        case "/":
            hasil = angka1 / angka2;
            System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            break;
        default : 
            System.out.println("Operator " + operator + " tidak ditemukan");
      } 
    }
}

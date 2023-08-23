package LatihanJavaDasar;

import java.util.Scanner;

public class latihan15 {
   public static void main(String[] args){
   
       Scanner input = new Scanner (System.in);
       int fn, fn_2, fn_1, n;
       fn = 1;
       fn_1 = 1;
       fn_2 = 0;
//       System.out.print("Masukkan angka : ");
//       n = input.nextInt();
       
       for(int i = 0; i <= 30; i++ ){
           System.out.println("angka fibonacci " + i + " : " + fn_2);           
           fn = fn_1 + fn_2;
           fn_2 = fn_1;
           fn_1 = fn;
       }
   }
}

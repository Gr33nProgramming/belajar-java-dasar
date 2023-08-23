
package LatihanJavaDasar;

import java.util.*;

public class latihan17 {
    public static void main(String[] args){
        Scanner input;
        input = new Scanner(System.in);
        int x ;
        System.out.print("Masukkan nilai x : ");
        x = input.nextInt();
        System.out.println("Jika diketahui nilai x = " + x + " maka, ");
        
              
        System.out.println("Hasil dari f(x) = (x + 2) x 10 : " + f(x));
    }
    public static int f(int x){
        int hasil;      
        hasil = (x + 2) * 10;
        return hasil;
    }
}

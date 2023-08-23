
package LatihanJavaDasar;

import java.util.Scanner;

public class latihan32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Mb/s To MB/s Converter");
        
        System.out.print("Mb/s : ");
        int mb = input.nextInt();
        float hasil = (float) mb / 8 ;
        System.out.println(mb + " mb/s" + " = " + hasil + " MB/s");
//        System.out.printf("%d Mb/s = %f MB/s \n", mb, hasil);
    }
}

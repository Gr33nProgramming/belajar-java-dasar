
package LatihanJavaDasar;

import java.util.*;

public class latihan9 {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println();
        
        Scanner Userinput = new Scanner(System.in);
        
        int nilaibenar = 27;
        boolean tebakan;
        int nilaitebakan;
        
        System.out.print("Masukkan angka tebakan : ");
        nilaitebakan = Userinput.nextInt();
        System.out.println("Angka tebakan : " + nilaitebakan );
        tebakan = (nilaitebakan == nilaibenar);
        System.out.println("Tebakan : " + tebakan);
        System.out.print("Masukkan angka diantara 17 dan 28 : ");
        nilaitebakan = Userinput.nextInt();
        tebakan = (nilaitebakan > 17) && (nilaitebakan < 28);
        System.out.println("Angka yang dimasukkan : " + tebakan); 
    }
}

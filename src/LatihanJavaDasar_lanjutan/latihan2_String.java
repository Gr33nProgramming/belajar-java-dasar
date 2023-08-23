package LatihanJavaDasar_lanjutan;

import java.util.Scanner;
import java.lang.String;

public class latihan2_String {
    public static void main(String[] args) {
        
        String kalimat = "Yazid Bintang Fathurrahman";
        
//      MENGAMBIL KOMPONEN DARI STRING
        System.out.println(kalimat.charAt(0));
        
//      OPERASI SUBSTRING
        String substring = kalimat.substring(6, 13);
        System.out.println(substring);
        
//      OPERASI CONCAT
        String kalimat2 = substring + " Pro";
        System.out.println(kalimat2);
        
//      LOWERCASE DAN UPPERCASE
        System.out.println(kalimat2.toUpperCase());
        System.out.println(kalimat2.toLowerCase());
        
//      REPLACE
        System.out.println(kalimat.replace("Bintang", "Star"));
        
//      COMPARE
        String nama1 = "Bintang";
        String nama2 = "Star";
        System.out.println(nama1.compareToIgnoreCase(nama2));
    }
}

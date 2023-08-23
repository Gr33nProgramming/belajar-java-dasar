
package LatihanJavaDasar;

import java.util.Scanner;
public class latihan10 {
    public static void main(String[] args){
        int nilai;
        
        Scanner Userinput = new Scanner(System.in);
        
        System.out.println("Selamat datang !");
        System.out.print("Silahkan masukkan nilai anda : ");
        nilai = Userinput.nextInt();
        if(nilai >= 90){
            System.out.println("Selamat anda mendapatkan nilai A !");
        }else if(nilai < 90 && nilai >= 80){
            System.out.println("Selamat anda mendapatkan nilai B");
        }else if (nilai < 80 && nilai >= 60){
            System.out.println("Selamat anda mendapatkan nilai C");
        }else if(nilai < 60 && nilai >= 40){
            System.out.println("Anda mendapatkan nilai D");
        }else{
            System.out.println("Anda mendapatkan nilai E");
            System.out.println("Jangan putus asa tetap semangat");
        }
        System.out.println("Sampai jumpa !");
    }
}

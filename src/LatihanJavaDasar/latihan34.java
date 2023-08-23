package LatihanJavaDasar;

import java.util.Scanner;

public class latihan34 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("===== PERKALIAN =====");
        System.out.println("=====================");
        System.out.print("Masukkan angka\t: ");
        int angka = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int hasil;
            hasil  = angka * i;
//            System.out.println(angka + " x " + i + " = " + hasil);
            System.out.printf("%d x %d = %d \n", angka, i, hasil);
        }
    }
}

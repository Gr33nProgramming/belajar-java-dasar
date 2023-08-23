package LatihanJavaDasar_lanjutan;

import java.util.*;

public class latihan7_Array {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Angka  : ");
        int inputAngka = userInput.nextInt();
        bintang(inputAngka);
        
    }
    static void bintang(int value){
        for (int i = 1; i <= value; i++) {
            for (int j = i; j <= value; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int v = 2; v <= i; v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

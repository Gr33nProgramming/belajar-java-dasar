
package LatihanJavaDasar;

import java.util.Scanner;

public class latihan21 {
    public static void main(String[] args){
    
        Scanner input;
        input = new Scanner (System.in);
        System.out.print("Masukkan nilai Faktorial: ");
        int inputangka = input.nextInt();
        System.out.println("Hasil dari " + inputangka + "! " + " = " + faktorial(inputangka));
        
    }
    private static int faktorial(int nilai){
        System.out.println(nilai + " x " + (nilai - 1));
        if(nilai == 1){
            return nilai;
        }
        
        return nilai * faktorial(nilai - 1);        
    }
}

package LatihanJavaDasar;

import java.util.*;

public class latihan18 {
    public static void main(String[] args){
        Scanner input; 
        input = new Scanner (System.in);
        System.out.println("Hello ...");
        System.out.println("Silahkan masukkan nilainya !");
        
        System.out.print("Masukkan nilai panjang : ");
        int inputPanjang = input.nextInt();
        System.out.print("Masukkan nilai lebar : ");
        int inputLebar = input.nextInt();
        System.out.println();
        gambar(inputPanjang, inputLebar);
        LuasKeliling(inputPanjang, inputLebar);
        
    }
    private static void gambar(int panjang, int lebar){
    
        for(int i = 1; i <= lebar; i++){
            for(int j = 1; j <= panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }       
    }
    private static int luas(int panjang, int lebar){
        
        int hasil = panjang * lebar;
        return hasil;
    
    }
    private static int keliling(int panjang, int lebar){
        
        int hasil = (panjang + lebar) * 2;
        return hasil;
    
    }
    private static void LuasKeliling(int panjang, int lebar){
       
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));
         
    }
}

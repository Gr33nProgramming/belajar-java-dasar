package LatihanJavaDasar;

import java.util.Scanner;

public class latihan33 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah kolom : ");
        int kolom = input.nextInt();
        System.out.println();
        
        for(int iBaris = 1; iBaris <= baris; iBaris++){
            for(int iKolom = 1; iKolom <= kolom; iKolom++){
                if(iBaris % 2 == 0){
                    System.out.print("# ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int iBaris = 1; iBaris <= baris; iBaris++){
            
            for(int iKolom = 1; iKolom <= kolom; iKolom++){
                
                if(iBaris == 1 || iBaris == baris ){
                    System.out.print("# ");
                }else{
                    if(iKolom == 1 || iKolom == kolom ){
                        System.out.print("# ");
                    }else{
                        System.out.print("* ");
                    }
                 }   
            }
            System.out.println();
         }
        System.out.println();
        for(int iBaris = 1; iBaris <= baris; iBaris++){
            for(int iKolom = 1; iKolom <= kolom; iKolom++){
                if(iBaris % 2 == 0){
                    if(iKolom % 2 == 0){
                        System.out.print("* ");
                    }else{
                        System.out.print("# ");
                    }
                }
                if(iBaris % 2 == 1){
                    if(iKolom % 2 == 1){
                        System.out.print("* ");
                    }else{
                        System.out.print("# ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
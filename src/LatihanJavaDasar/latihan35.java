package BelajarJavaDasar.src.LatihanJavaDasar;

import java.util.Scanner;

public class latihan35 {
    public static void main(String[] args) {

        int inputSatu;

        Scanner input = new Scanner(System.in);

        System.out.println("======== Program Bangun Datar ========");
        System.out.print("Masukkan jumlah Bintang : ");
        inputSatu = input.nextInt();
        System.out.println();
        for(int i = 1; i <= inputSatu; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = inputSatu; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= inputSatu; i++){
            for(int j = 1; j <= inputSatu; j++){
               if(i % 2 == 0){
                   if(j % 2 == 0){
                       System.out.print("  ");
                   }else{
                       System.out.print(" 1 ");
                   }
               }
               if(i % 2 == 1){
                   if(j % 2 == 1){
                       System.out.print("  ");
                   }else{
                       System.out.print(" 1 ");
                   }
               }
            }
            System.out.println();
        }
    }
}

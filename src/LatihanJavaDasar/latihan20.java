
package LatihanJavaDasar;

import java.util.Scanner;

public class latihan20 {
    public static void main(String[] args){
        
        Scanner input;
        input = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Masukkan nama bangun datar : ");
        String inputNama = input.nextLine();
        System.out.println();
        bangundatar(inputNama);
        System.out.println("Ini adalah bangun datar " + inputNama.toUpperCase());
        
    }
    private static void bangundatar(String NamaBangunDatar){
        
        if(NamaBangunDatar.equalsIgnoreCase("persegi panjang")){
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= 10; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        else if(NamaBangunDatar.equalsIgnoreCase("persegi")){
            for(int i = 1; i <= 10; i++){
                for(int j = 1; j <= 10; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        else if(NamaBangunDatar.equalsIgnoreCase("segitiga siku siku")){
            for(int i = 1; i <= 10; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        else if(NamaBangunDatar.equalsIgnoreCase("segitiga")){
            for(int i = 1; i <= 10; i++){
                for(int j = i; j <= 10; j++){
                    System.out.print("  ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("* ");
                }
                for(int h = 2; h <= i; h++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Nama bangun datar tidak tersedia.");
        }
    }
}

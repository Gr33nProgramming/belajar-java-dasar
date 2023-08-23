
package LatihanJavaDasar;

import java.util.*;

public class latihan31 {
    public static void main(String[] args) {
        System.out.println("-------- LATIHAN -------");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------- SOAL 1 ---------");
        
        int x = 2;
        
        do{
            System.out.print(x + " ");
            x+=2;
        }
        while(x <= 100);
        
        System.out.println();
        
        System.out.println("--------- SOAL 2 ----------");
        
        System.out.print("Masukkan jumlah bintang : ");
        int userInput = input.nextInt();
        System.out.println();
        for(int i = 1; i <= userInput; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= userInput; k++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
        System.out.println();
        
        System.out.println("---------- SOAL 3 ----------");
        System.out.print("Masukkan jumlah bintang : ");
        userInput = input.nextInt();
        System.out.println();
        for(int a = 1; a <= userInput; a++){
            for(int b = 2; b <= a; b++){
                System.out.print(" ");
            }
            for(int v = 1; v <= userInput; v++){
                System.out.print("* ");
            }
        System.out.println();
        }
        for(int d = userInput; d >= 1; d--){
            for(int g = 1; g <= d; g++){
                System.out.print(" ");
            }
            for(int f = 1; f <= userInput; f++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

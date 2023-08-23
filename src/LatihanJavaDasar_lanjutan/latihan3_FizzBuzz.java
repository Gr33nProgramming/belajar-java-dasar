package LatihanJavaDasar_lanjutan;

import java.util.Scanner;

public class latihan3_FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        fizzBuzz(angka);
        factorial(angka);
    }
    static void fizzBuzz(int value){
        if(value >= 15){
            for(int i = 1; i <= value; i++){
                if(i % 15 == 0){
                    System.out.println("FizzBuzz");
                }else if(i % 3 == 0){
                    System.out.println("Fizz");
                }else if(i % 5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Nope ! ");
        }
    }
    static int factorial(int nilai){
        if(nilai == 0){
            return 1;
        }else{
            return nilai * factorial(nilai - 1);
        }
    }
    static int factorialNormal (int factorial){
        int hasil = 1;
        for(int i = factorial; i >= 1; i--){
            hasil*=i;
        }
        return hasil;
    }
}

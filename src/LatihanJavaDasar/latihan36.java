package LatihanJavaDasar;

import java.util.Scanner;

public class latihan36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int userInput = input.nextInt();
        System.out.println(factorialRecursive(userInput));
        System.out.println(factorialTailRecursive(1, userInput));
    }
    public static int factorial(int paramFactorial){
        int hasil = 1;
        for(int i = 1; i <= paramFactorial; i++){
            hasil = hasil * i;
        }
        return hasil;
    }
    public static int factorialRecursive(int paramFactorial){
        if(paramFactorial == 0){
            return 1;
        }else{
            return paramFactorial * factorialRecursive(paramFactorial - 1);
        }
    }
    public static int factorialTailRecursive(int totalValue, int value){
        if(value == 0){
            return totalValue;
        }else{
            return factorialTailRecursive(totalValue * value, value - 1);
        }
    }
}

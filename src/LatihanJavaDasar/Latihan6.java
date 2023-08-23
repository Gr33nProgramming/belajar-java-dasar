
package LatihanJavaDasar;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        
        int luas,panjang,lebar;
        
        System.out.print("Panjang : ");
        panjang = UserInput.nextInt();
        System.out.print("Lebar : ");
        lebar = UserInput.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas : " + luas);
    }
}

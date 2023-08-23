
package LatihanJavaDasar_lanjutan;

import java.util.Scanner;

public class latihan3_Try {
    public static void main(String[] args) {

        int [] array = {0,1,2,3,4};
        int Panjang, Lebar, Tinggi;
        double Luas;
        Scanner input = new Scanner(System.in);

//        try{
//            System.out.print("Index : ");
//            int index = input.nextInt();
//            System.out.printf("index %d = array %d \n", index,array[index]);
//        }catch(Exception e){
//            System.err.println(e);
//        }finally{
//            System.out.println("Finally");
//        }
//
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("-------------------------------");
        System.out.print("Panjang = ");
        Panjang = input.nextInt();
        System.out.print("Lebar = ");
        Lebar = input.nextInt();
        System.out.print("Tinggi = ");
        Tinggi = input.nextInt();
        Luas = Panjang * Lebar * Tinggi;

        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("-------------------------------");
        System.out.println("Panjang = " + Panjang);
        System.out.println("Lebar = " + Lebar);
        System.out.println("Tinggi = " + Tinggi);
        System.out.println("Luas Persegi Panjang = " + Luas);
    }
}


package LatihanJavaDasar;

import java.util.*;

public class latihan29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array1 = {4,2,1,5,6,1,4,5};
        printarray(array1);
        int[] array2 = {2,3,41,4,5,1,2,3};
        printarray(array2);
        System.out.println("__________________________");
        
        int[] tambah = new int[array1.length];
        int[] kurang = new int[array1.length];
        int[] kali = new int[array1.length];
        int[] bagi = new int[array1.length];
        
        for(int a = 0; a < array1.length; a++){
            kali[a] = array1[a] * array2[a];
            tambah[a] = array1[a] + array2[a];
            kurang[a] = array1[a] - array2[a];
            bagi[a] = array1[a] / array2[a];
            System.out.print(array1[a] + " ");
        }
        System.out.println();
        
        printarray(kurang);
        
        int[] arraygabungan = new int[array1.length + array2.length];
        
        for(int g = 0; g < array1.length; g++){
            arraygabungan[g] = array1[g];
            System.out.print(arraygabungan[g] + " ");
        }
        for(int g = 0; g < array2.length; g++){
            arraygabungan[g + array1.length] = array2[g];
            System.out.print(arraygabungan[g + array1.length] + " ");
        }
        System.out.println();
        printarray(arraygabungan);
        Arrays.sort(arraygabungan);
        printarray(arraygabungan);
        for(int g = arraygabungan.length - 1; g > 0; g--){
            System.out.print(arraygabungan[g] + " ");
        }
        System.out.println();
        
        int[] arraysort = Arrays.copyOf(arraygabungan, arraygabungan.length);
        for(int g = 0; g < arraygabungan.length; g++){
            arraygabungan[g] = arraysort[arraysort.length - 1 - g];
        }
        printarray(arraygabungan);
    }
    
    private static void printarray(int[] dataarray){
        System.out.println(Arrays.toString(dataarray));
    }
}

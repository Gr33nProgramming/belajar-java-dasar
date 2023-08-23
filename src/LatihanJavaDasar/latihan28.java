package LatihanJavaDasar;

import java.util.Arrays;

public class latihan28 {
    public static void main(String[] args) {
        
        System.out.println("===== ARRAY MULTIDIMENSI =====");
        
        int[][] arrayDimensi2 = {{1,2,3,4,5}, {10,9,8,7,6}};
        String[][] array2 = {
                            {"Yazid", "Bintang"}, 
                            {"Fathurrahman"}
                            };
        
        
        System.out.println("Array dimensi dua : " + Arrays.deepToString(arrayDimensi2));
        printArray(arrayDimensi2);
        
        System.out.println();
        int[][] arrayAngka = new int [5][4];
        
        System.out.println();
        
        printArray(arrayAngka);
        for(int[] baris : arrayAngka){
            for(int kolom : baris){
                System.out.print(kolom + " , ");
            }
            System.out.println();
        }
        
        
    }
    private static void printArray(int[][] dataArray){
        for(int a = 0; a < dataArray.length; a++){          
            System.out.println(Arrays.toString(dataArray[a]));
        }
        
    }
}

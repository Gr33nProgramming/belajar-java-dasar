package LatihanJavaDasar;

import java.util.Arrays;

public class latihan26 {
    public static void main(String[] args) {
        
        int [] array1 = {1,2,3,4,5,7,5,3,9,3,1};
        System.out.println(array1.length);
        printArray(array1);
        
        int[] array2 = new int[0];
        
        System.out.println("Copy array dengan loop");
        for(int a = 0; a < array2.length; a++){
            array1[a] = array2[a];
        }
        printArray(array1);
        
        System.out.println("Copy array dengan CopyOf");
        array2 = Arrays.copyOf(array1,11);
        printArray(array2);
        
        System.out.println("CopyOfRange");
        int[] array4 = Arrays.copyOfRange(array1,2,6);
        printArray(array4);
    }
    private static void printArray(int[] data){
        System.out.println("Array : " + Arrays.toString(data));
    }
}

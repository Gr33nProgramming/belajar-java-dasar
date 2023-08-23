
package LatihanJavaDasar;

import java.util.Arrays;

public class latihan27 {
    public static void main(String[] args) {
        System.out.println("====== LATIHAN =======");
        System.out.println();
        
        int[] array1 = {2,5,1,3,7,2,1};
        int[] array2 = {2,6,7,2,1,5,7};
        int[] arrayHasil = new int[array1.length];
        System.out.println("Operasi dua array");
        for(int operasi = 0; operasi < array1.length; operasi++){
            arrayHasil[operasi] = array1[operasi] + array2[operasi];
        }
        
        System.out.println("Array 1 = " + Arrays.toString(array1));
        System.out.println("Array 2 = " + Arrays.toString(array2));
        System.out.println("Hasil   = " + Arrays.toString(arrayHasil));
        
        
        System.out.println("Penggabungan dua array");
        
        int[] arrayHasil2 = new int[array1.length + array2.length];
        
        for(int a = 0; a < array1.length; a++){
            arrayHasil2[a] = array1[a];
            for(int b = 0; b < array2.length; b++){
                arrayHasil2[b + array1.length] = array2[b];
            }
        }
        System.out.println("arrayhasil 2 = " + Arrays.toString(arrayHasil2));
        sortArray(arrayHasil2);
        System.out.println("Sort terbalik ");
        sortArray(array1);
    }
    private static void sortArray(int[] dataArray){
        Arrays.sort(dataArray);
        int[] penampungArray = Arrays.copyOf(dataArray, dataArray.length);
        for(int c = 0; c < dataArray.length; c++){
            dataArray[c] = penampungArray[(dataArray.length - 1) - c];
        }
        System.out.println(Arrays.toString(dataArray));
    }
}

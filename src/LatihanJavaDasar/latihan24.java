package LatihanJavaDasar;

import java.util.*;

public class latihan24 {
    
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);

        int[] array = {1, 2, 3};
        
        String[] arrayString = {"Yazid","Bintang","Fathurrahman"};
        System.out.println("Jumlah data pada arrayString : " + arrayString.length);
        System.out.println(Arrays.toString(arrayString));
        System.out.println("Looping dengan properti array length");
        for(int a = 0; a < arrayString.length; a++){
            System.out.println((a + 1) + "." + arrayString[a]);
        }
        System.out.println("Looping for each");
        for(String isiArray : arrayString){
            System.out.println(isiArray);
        
        }
    }
    
}

package LatihanJavaDasar;


import java.util.*;


public class latihan30 {
    public static void main(String[] args) {
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        int data[] = new int [32];
        int i;
        System.out.print("Masukkan bilangan desimal : ");
        int desimal = input.nextInt();
        
        for(i = 0; desimal > 0; i++){
            data[i] = desimal % 2;
            desimal = desimal / 2;
        }
        System.out.println(Arrays.toString(data));
        System.out.print("Bilangan biner : ");
        System.out.println(i);
        for(i = i - 1; i >= 0; i--){
            System.out.print(data[i]);
        }
        System.out.println();
        
    }
}

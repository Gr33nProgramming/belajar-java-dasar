package BelajarJavaDasar.Latihan.PlayGround.Logical;

import java.util.Scanner;

public class Play3 {
    private static void sequentialSearch(String value){
        String[] dataElektronik= {"Laptop", "Smartphone", "TV", "Camera"};
        boolean cekStatus = false;
        int getIndex = 0;
        for (int i = 0; i < dataElektronik.length; i++) {
            if(value.equalsIgnoreCase(dataElektronik[i])){
                cekStatus = true;
                getIndex = getIndex + i;
                break;
            }
        }
        if(cekStatus){
            System.out.println("Data " + dataElektronik[getIndex].toUpperCase() + " ditemukan di nomor " + (getIndex + 1));
        }else{
            System.out.println("Data " + value.toUpperCase() + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan input : ");
        String dataInput = scanner.nextLine();
        sequentialSearch(dataInput);
    }
}

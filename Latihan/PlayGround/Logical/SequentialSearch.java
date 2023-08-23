package BelajarJavaDasar.Latihan.PlayGround.Logical;

import java.util.Scanner;
public class SequentialSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {3,4,2,8,5,7,9,1};
        int searchItem;
        int getIndex = 0;
        boolean dataStatus = false;
        System.out.print("Masukkan data : ");
        searchItem = scanner.nextInt();
        for (int i = 0; i < data.length; i++) {
            if(searchItem == data[i]){
                dataStatus = true;
                getIndex = i;
                break;
            }
        }
        if(dataStatus){
            System.out.println("Data ditemukan pada posisi ke - " + (getIndex + 1));
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }

}

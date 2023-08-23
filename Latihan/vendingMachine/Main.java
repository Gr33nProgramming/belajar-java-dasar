package vendingMachine;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoose;
        String[] pilihan = {"Aqua", "Milo", "Fresh Tea", "Mizone", "Pocari Sweat"};
        long[] harga = {4000, 8000, 6000, 3000, 9000};
        int exit = pilihan.length + 1;
        String confirm;
        long kembalian;
        int uang;
        String confirmUang;

        do{
            System.out.println("--------------");
            System.out.println("Selamat Datang");
            System.out.println("--------------");
            System.out.println("Menu");
            for(int i = 0; i < pilihan.length; i++){
                System.out.println((i + 1) + ". " +  pilihan[i] + " : Rp " + harga[i]);
            }
            System.out.println(exit + ". Exit");
                System.out.print("Masukkan pilihan anda : ");
                userChoose = input.nextInt();input.nextLine();
                if(userChoose <= 0 || userChoose > pilihan.length + 1){
                    System.out.println("Masukkan pilihan sesuai menu di atas ! ");
                    System.out.print("Masukkan pilihan anda : ");
                    userChoose = input.nextInt();input.nextLine();
                }
            System.out.println(pilihan[userChoose - 1] + "\nRp " +  harga[userChoose - 1]);
            System.out.print("Apakah anda ingin melanjutkan pembayaran ? (y / n) : ");
            confirm = input.nextLine();
            if(confirm.equalsIgnoreCase("y")){
                System.out.println("Lakukan pembayaran Rp " + harga[userChoose - 1]);
                    System.out.print("Masukkan uang anda : ");
                    uang = input.nextInt();input.nextLine();
                    if(uang < harga[userChoose - 1]){
                        System.out.println("Maaf uang anda tidak mencukupi");
                        System.out.print("Apakah anda ingin melanjutkan ? (y / n): ");
                        confirmUang = input.nextLine();
                        if(confirmUang.equalsIgnoreCase("y")){
                            System.out.print("Masukkan uang anda : ");
                            uang = input.nextInt();input.nextLine();
                        }else{
                            System.out.println("Terima kasih selamat datang kembali");
                            break;
                        }
                    }
                kembalian = uang - harga[userChoose - 1];
                System.out.println("Kembalian : " + kembalian);
                System.out.println("Terima kasih ");
            }
        }while(confirm.equalsIgnoreCase("n"));
    }
}

package vendingMachine2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Coca - Cola", "Sprite", "Milo", "Aqua", "Pepsi"};
        int[] harga = {4000, 3000, 8000, 4000, 5000};
        ArrayList <Long> totalBelanja = new ArrayList<Long>();
        int total = 0;
        int pilihanUser = 0;
        int exit = menu.length + 1;
        int uang = 0;
        int kembalian = 0;
        String confirm;

        System.out.println("\nSelamat Datang");
        do{

            System.out.println("Menu");
            for(int i = 0; i < menu.length; i++){
                System.out.println((i + 1) + ". " + menu[i] + " : Rp " + harga[i]);
            }

            System.out.println(exit + ". Exit");
            System.out.print("Masukkan pilihan anda : ");
            pilihanUser = input.nextInt();input.nextLine();
            if(pilihanUser == exit){
                break;
            }
            System.out.println(menu[pilihanUser - 1] + " : Rp " + harga[pilihanUser - 1]);
            System.out.print("Masukkan uang anda : Rp ");
            uang = input.nextInt();input.nextLine();
            if(uang < harga[pilihanUser - 1]){
                for(int a = 1; a <= 3; a++){
                    System.out.println("Gagal !\nUang yang anda masukkan tidak mencukupi");
                    System.out.print("Masukkan uang anda sesuai harga : Rp ");
                    uang = input.nextInt();;input.nextLine();
                    if(uang >= harga[pilihanUser - 1]){
                        System.out.println("Berhasil !");
                        break;
                    }
                    if(a == 3){
                        System.out.println("Telah melewati batas percobaan !");
                    }
                }
            }else{
                System.out.println("Berhasil !");
            }
            if(uang >= harga[pilihanUser - 1]){
                totalBelanja.add((long) harga[pilihanUser - 1]);
            }
            kembalian = uang - harga[pilihanUser - 1];
            System.out.print("Apakah anda ingin membeli lagi ? (y / n) : ");
            confirm = input.nextLine();
        }while(confirm.equalsIgnoreCase("y"));
        for(int a = 0; a < totalBelanja.size(); a++){
            total += totalBelanja.get(a);
        }
        System.out.println("Total belanja anda : Rp " + total);
        System.out.println("Kembalian : Rp " + kembalian);
        System.out.println("Terima Kasih :)");
    }
}

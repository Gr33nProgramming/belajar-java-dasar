package LatihanCobaCoba;

import java.util.*;

public class cobaSatu {
    public static void main(String[] args) {

        String pilihanComp, hasil, player;
        int pilihanPlayer, confirm;

        Scanner input = new Scanner(System.in);

        System.out.println("Apakah anda ingin bermain ? ");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan nomor : ");
        confirm = input.nextInt();

        if(confirm == 1){
            do{
                int a = (int) Math.round(Math.random() * 90);
                if(a < 30){
                    pilihanComp = "semut";
                }else if(a > 30 && a < 60){
                    pilihanComp = "orang";
                }else{
                    pilihanComp = "gajah";
                }
                System.out.println("\n------- Suit Jawa --------");
                System.out.println("Pilihan : ");

                System.out.println("1. Semut");
                System.out.println("2. Orang");
                System.out.println("3. Gajah");

                System.out.print("Masukkan Pilihan Anda : ");
                pilihanPlayer = input.nextInt();

                if(pilihanPlayer == 1){
                    player = "semut";
                }else if(pilihanPlayer == 2){
                    player = "orang";
                }else{
                    player = "gajah";
                }

                if(player.equals(pilihanComp)){
                    hasil = "Seri";
                }else if(player.equals("semut") && pilihanComp.equals("gajah") || player.equals("orang") && pilihanComp.equals("semut") || player.equals("gajah") && pilihanComp.equals("orang")){
                    hasil = "Menang";
                }else{
                    hasil = "Kalah";
                }

                System.out.println("Pilihan Anda : " + player.toUpperCase());
                System.out.println("Piihan Comp : " + pilihanComp.toUpperCase());
                System.out.println("hasil : " + hasil.toUpperCase());

                System.out.println("------- Suit Jawa --------");
                System.out.println();

                System.out.println("Apakah anda ingin melanjutkan ? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan nomor : ");
                confirm = input.nextInt();

                if(confirm == 2){
                    break;
                }
            }while(confirm == 1);
        }
            System.out.println("TerimaKasih !");
    }
}

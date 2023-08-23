package hitungTotalBelanja;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList <String> tampungJumlahBarang = new ArrayList<>();
        ArrayList <Integer> tampungJumlahHargaSatuan = new ArrayList<>();
        ArrayList <Long> tampungJumlahHarga = new ArrayList<>();
        ArrayList <Integer> tampungJumlahPerBarang = new ArrayList<>();

        String namaBarang = "";
        int jumlahPerBarang = 0;
        int hargaBarang = 0;
        long totalHarga = 0;
        int pilihanUser;
        long harga = 0;
        String confirm = "";

        System.out.println("=======================");
        System.out.println("\tSelamat Datang");
        System.out.println("=======================");

        do{
            System.out.println("1. Masukkan belanjaan");
            System.out.println("2. Total belanjaan");
            System.out.println("3. Hapus belanjaan");
            System.out.print("Masukkan pilihan anda : ");
            pilihanUser = input.nextInt();input.nextLine();
            switch(pilihanUser){
                case 1:
                    do{
                        System.out.print("Masukkan nama barang : ");
                        namaBarang = input.nextLine();
                        System.out.print("Masukkan harga barang : ");
                        hargaBarang = input.nextInt();input.nextLine();
                        System.out.print("Masukkan jumlah barang : ");
                        jumlahPerBarang = input.nextInt();input.nextLine();
                        harga = (long) hargaBarang * jumlahPerBarang;
                        System.out.println("Total harga : " + harga);
                        tampungJumlahPerBarang.add(jumlahPerBarang);
                        tampungJumlahHargaSatuan.add(hargaBarang);
                        tampungJumlahBarang.add(namaBarang);
                        tampungJumlahHarga.add(harga);
                        System.out.print("Apakah anda ingin kembali ke menu utama ? (y/n) : ");
                        confirm = input.nextLine();
                    }while(confirm.equalsIgnoreCase("n"));
                     break;
                case 2:
                    do{
                        if(tampungJumlahBarang.size() == 0){
                            System.out.println("Data belum tersedia");
                        }else{
                            System.out.println("Total belanjaan ");
                            for(int i = 0; i < tampungJumlahBarang.size(); i++){
                                System.out.println((i + 1) + ". " + tampungJumlahBarang.get(i) + " x " + tampungJumlahPerBarang.get(i));
                                System.out.println("Harga satuan : " + tampungJumlahHargaSatuan.get(i));
                                System.out.println("Harga total : " + tampungJumlahHarga.get(i));
                                for(int b = 0; b < tampungJumlahHarga.size(); b++){
                                    totalHarga += tampungJumlahHarga.get(b);
                                }
                                System.out.println("Total : " + totalHarga);
                            }
                        }
                        System.out.print("Apakah anda ingin kembali ke menu utama ? (y/n) : ");
                        confirm = input.nextLine();
                    }while(confirm.equalsIgnoreCase("n"));
                    break;
            }
        }while(confirm.equalsIgnoreCase("y"));
    }
}

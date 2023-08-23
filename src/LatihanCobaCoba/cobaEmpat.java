package LatihanCobaCoba;

import java.util.Scanner;

public class cobaEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jumlahJamKerja = 0;
        int tarifPerJam = 0;
        double gaji = 0d;
        int potonganPajak = 0;
        int persentasePajak = 10;
        double gajiBersih = 0d;

        System.out.println("\n\tAplikasi penghitung gaji karyawan");
        System.out.println("\t-----------------------------------");

        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan jumlah jam kerja : ");
        jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan tarif per jam : ");
        tarifPerJam = input.nextInt();input.nextLine();
        gaji = jumlahJamKerja * tarifPerJam;
        potonganPajak = (int) (gaji * persentasePajak) / 100;
        gajiBersih = gaji - potonganPajak;
        System.out.println("\n\t\t\tGaji Karyawan");
        System.out.println("\t-----------------------------------");
        System.out.println("Nama karyawan\t : " + nama.toUpperCase());
        System.out.println("Jumlah jam kerja : " + jumlahJamKerja + " Jam");
        System.out.println("Tarif per jam\t : " + tarifPerJam);
        System.out.println("Potongan pajak\t : " + potonganPajak);
        System.out.println("Gaji bersih\t\t : " + gajiBersih);
    }
}

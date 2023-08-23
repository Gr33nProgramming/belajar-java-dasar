
package LatihanJavaDasar;
import java.util.Scanner;
public class latihan14 {
    public static void main (String[] args){
        int nilaiAwal, nilaiAkhir, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal : ");
        nilaiAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        nilaiAkhir = input.nextInt();
        
        System.out.print("total = ");
        total = 0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.print(nilaiAwal + " + " );
            nilaiAwal++;
        }
            System.out.println("= " + total);
    }
}

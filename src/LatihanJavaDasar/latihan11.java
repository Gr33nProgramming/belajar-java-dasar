
package LatihanJavaDasar;

import java.util.*;

public class latihan11 {
    
    public static void main(String[] args){
        
        String pilihan;
        int option;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pilih menu : ");
        option = input.nextInt();
        switch (option){
            case 1:
                System.out.print("Coca Cola ");
                System.out.println("Rp 5.000");
                System.out.print("Silahkan pilih bayar atau kembali : ");
                pilihan = input.next();
                System.out.println("Anda akan membayar sebesar Rp 5.000");
                System.out.print("PIlih lanjut atau kembali : ");
                pilihan = input.next();
                System.out.println("Terima Kasih anda telah membayar sebesar Rp 10.000");
            break;
            case 2:
                System.out.print("Pepsi ");
                System.out.println("Rp 10.000");
                System.out.print("Silahkan pilih bayar atau kembali : ");
                pilihan = input.next();
                System.out.println("Anda akan membayar sebesar Rp 10.000");
                System.out.print("PIlih lanjut atau kembali : ");
                pilihan = input.next();
                System.out.println("Terima Kasih anda telah membayar sebesar Rp 10.000");
            break;
        }        
    }
    
}

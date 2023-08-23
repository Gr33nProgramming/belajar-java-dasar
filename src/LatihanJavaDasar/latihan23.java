
package LatihanJavaDasar;

import java.util.*;

public class latihan23 {

    public static void main(String[] args){

        Scanner input;
        input = new Scanner (System.in);
        
//        deklarasi
        int gaji,tunjanganKeluarga,tunjanganPerAnak,tunjanganAnak,inputjmlanak;
        double pph,gajibersih;
        String inputNama,inputJabatan,inputStatus;
        
        
        System.out.print("Masukkan Nama : ");
        inputNama = input.nextLine();
        System.out.print("Jabatan : ");
        inputJabatan = input.nextLine();
        System.out.print("Status (Menikah / Belum Menikah) : ");
        inputStatus = input.nextLine();
        
        if(inputStatus.equalsIgnoreCase("Menikah")){
            System.out.print("Jumlah Anak : ");
            inputjmlanak = input.nextInt();
            
            if(inputStatus.equalsIgnoreCase("Belum Menikah")){                
                System.out.println("===== SLIP GAJI =====");
                System.out.println("Nama : " + inputNama.toUpperCase());
                
                if(inputJabatan.equalsIgnoreCase("Direktur")){
                    System.out.println("Jabatan : " + inputJabatan.toUpperCase());
                    gaji = 5000000;
                    pph = gaji * 0.0015;
                    System.out.println(pph);
                    System.out.println("gaji : " + gaji);
                    
                    if(inputStatus.equalsIgnoreCase("Menikah")){
                        tunjanganKeluarga = 450000;
                        tunjanganPerAnak = 200000;
                        tunjanganAnak = tunjanganPerAnak * inputjmlanak; 
                        System.out.println("Tunjangan Keluarga : " + tunjanganKeluarga);
                        System.out.println("Anak : " + inputjmlanak);
                        gajibersih = gaji + tunjanganAnak + tunjanganKeluarga - pph;
                    }
                }
            }            
        }
    }
}




//        switch (inputJabatan){
//            case "Direktur" : 
//                gaji = 5000000;
//                System.out.println("Jabatan : " + inputJabatan);
//                System.out.println("gaji : " + gaji);
//                int gajibersih = gaji + 222;
//                System.out.println("Gaji bersih : " + gajibersih);
//                break;
//            case "Manager" : 
//                gaji = 4000000;
//                System.out.println("Jabatan : " + inputJabatan);
//                System.out.println("gaji : " + gaji);
//                break;
//            case "Kabag" : 
//                gaji = 3000000;
//                System.out.println("Jabatan : " + inputJabatan);
//                System.out.println("gaji : " + gaji);
//                break;
//            default : 
//                gaji = 2000000;
//                System.out.println("Jabatan : " + inputJabatan);
//                System.out.println("gaji : " + gaji);
//                break;
//            
//        
//        }  
package LatihanCobaCoba;

import java.util.Scanner;

public class cobaDua {
    public static void main(String[] args) {
        String[] huruf = {"a","b","c","d","e"};
        double angkaPertama, angkaKedua;
        String confirm = "";
        double hasil = 0;
        String operator;
        Scanner input = new Scanner(System.in);

        for(int y = 0; y < huruf.length; y++){
            for(int x = huruf.length; x > y; x--){
                System.out.print(huruf[y] + " ");
            }
            System.out.println();
        }
        do{
            try{
                System.out.print("Angka pertama : ");
                angkaPertama = input.nextDouble();input.nextLine();
                System.out.print("Angka kedua : ");
                angkaKedua = input.nextDouble();input.nextLine();
                System.out.print("Operator : ");
                operator = input.nextLine();
                switch (operator){
                    case "+":
                        hasil = angkaPertama + angkaKedua;
                        break;
                    case "-":
                        hasil = angkaPertama - angkaKedua;
                        break;
                    case "*":
                        hasil = angkaPertama * angkaKedua;
                        break;
                    case "/":
                        hasil = angkaPertama / angkaKedua;
                        break;
                    case "%":
                        hasil = angkaPertama % angkaKedua;
                        break;
                }
                System.out.println("Hasil : " + hasil);
            }catch(Exception e){
                System.out.println("Yang anda masukkan bukan angka ! ");
            }finally{
                System.out.print("Apakah anda ingin melanjutkan ? (y/n): ");
                confirm = input.nextLine();
            }
        }while(confirm.equalsIgnoreCase("y"));
    }
}

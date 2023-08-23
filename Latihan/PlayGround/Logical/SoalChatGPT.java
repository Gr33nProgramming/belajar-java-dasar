package PlayGround.Logical;
import java.util.Scanner;
public class SoalChatGPT {
    public static void main(String[] args) {
//        Soal Pertambahan
        Scanner userInput = new Scanner(System.in);
        int inputAngkaPertama, inputAngkaKedua, inputFaktorial, inputBintang, inputPrima;
//        System.out.println("----------------");
//        System.out.println("Soal Pertambahan");
//        System.out.println("----------------");
//        System.out.print("Masukkan angka pertama : ");
//        inputAngkaPertama = userInput.nextInt();
//        System.out.print("Masukkan angka kedua : ");
//        inputAngkaKedua = userInput.nextInt();
//        System.out.println(inputAngkaPertama + " + " + inputAngkaKedua + " = " + operasiPertambahan(inputAngkaPertama,inputAngkaKedua));
//
////        Soal Faktorial
//        System.out.println("----------------");
//        System.out.println("Soal Faktorial");
//        System.out.println("----------------");
//        System.out.print("Masukkan angka faktorial : ");
//        inputFaktorial = userInput.nextInt();
//        System.out.println("Angka faktorial " + inputFaktorial + " = " + factorial(inputFaktorial));
//
////        Soal pola segitiga
//        System.out.println("----------------");
//        System.out.println("Soal Segitiga Bintang");
//        System.out.println("----------------");
//        System.out.print("Masukkan jumlah bintang : ");
//        inputBintang = userInput.nextInt();
//        segitigaBintang(inputBintang);

//        Soal Bilangan Prima
        System.out.println("----------------");
        System.out.println("Soal Bilangan Prima");
        System.out.println("----------------");
        System.out.print("Masukkan bilangan prima : ");
        inputPrima = userInput.nextInt();
        bilanganPrima(inputPrima);
    }
    static int operasiPertambahan(int angkaPertama, int angkaKedua){
        return angkaPertama + angkaKedua;
    }
    static int factorial(int angkaFaktorial){
        if(angkaFaktorial == 0){
            return 1;
        }else{
            return angkaFaktorial * factorial(angkaFaktorial - 1);
        }
    }
    static void segitigaBintang(int angkaBintang){
        for (int i = 1; i <= angkaBintang; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void bilanganPrima(int angkaPrima){
        if( angkaPrima > 1 && angkaPrima * angkaPrima == 1){
            System.out.println("Prima");
        }else{
            System.out.println("Bukan");
        }
    }
}

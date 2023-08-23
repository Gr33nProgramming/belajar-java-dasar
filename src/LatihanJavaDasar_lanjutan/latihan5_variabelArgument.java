package LatihanJavaDasar_lanjutan;

public class latihan5_variabelArgument {
    public static void main(String[] args) {
        nilai("Mr", 80,80,60,70,78,67,56,85,90,76);
        System.out.println(factorial(5));
    }
    static void nilai(String nama, int ... jumlahNilai){
        int hitung = 0;
        for(int i : jumlahNilai){
            hitung = hitung + i;
        }
        int rataRata = hitung / jumlahNilai.length;
        if(rataRata >= 70){
            System.out.println("Rata rata nilai " + nama + " " + rataRata + ", selamat anda lulus ! ");
        }else{
            System.out.println("Rata rata nilai " + nama + " " + rataRata + ", anda tidak lulus !");
        }
    }
    static int factorial (int values){
        if(values == 0){
            return 1;
        }else{
            return values * factorial(values - 1);
        }
    }
}

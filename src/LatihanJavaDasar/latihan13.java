
package LatihanJavaDasar;


public class latihan13 {
    public static void main(String[] args){
        int a = 1;
        boolean kondisi  = true;
        
        do{
            System.out.println("DO WHILE");
            a++;
            if(a == 10){
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("AKHIR PROGRAM");
    }
}

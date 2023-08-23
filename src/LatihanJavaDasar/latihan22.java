
package LatihanJavaDasar;


public class latihan22 {
    public static void main(String[] args){
        int satu;
        
        satu = 1;
        
        for(int i = 1; i <= 8; i++){
            System.out.println(satu + " + " + (satu * 2));
            satu*=4;
        }
        System.out.println();
        int c = 1;
        for(int a = 1; a <= 5; a++){
            for(int b = 1; b <= a; b++){
                
                System.out.print(c + " ");
                c+=1;
            }
            System.out.println();
//            c+=1;
        }
        
    }
}

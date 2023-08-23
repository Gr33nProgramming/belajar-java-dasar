
package LatihanJavaDasar;


public class Latihan7 {
    public static void main(String[] args){
         byte a = 0;
        String a_bits;
        
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf("%s = %d \n",a_bits, a);
    }
}

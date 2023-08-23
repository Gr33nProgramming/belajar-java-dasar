package LatihanJavaDasar_lanjutan;

import java.util.Arrays;

public class latihan1_String {
    public static void main(String[] args) {
        char[] kataChar= {'H','a','l','l','o','C','h','a','r'};
        String kataString = "Hallo String";
        for(int c = 0; c < kataChar.length; c++){
            System.out.print(kataChar[c]);
        }
        System.out.println();
        System.out.println(kataString);
        
        System.out.println(kataChar[1]);
        System.out.println(kataString.charAt(1));
        
        kataChar[0] = 'b';
        
        System.out.println(Arrays.toString(kataChar));
        
//        merubah komponen dalam string secara tidak langsung

        System.out.println("T" + kataString.substring(1, 12));
        
        kataString = "T" + kataString.substring(1, 12);
        
        kataString = kataString + " tallo";
        
        System.out.println(kataString);
    }
}

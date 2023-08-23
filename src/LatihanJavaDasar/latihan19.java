package LatihanJavaDasar;

import java.util.*;

public class latihan19 {
    public static void main(String[] args){
        
        Scanner input;
        input = new Scanner(System.in);
        String userinput;
        System.out.print("Masukkan nama : ");
        userinput = input.next();
        bot(userinput);
        
        
    }
    private static void bot(String userinput){
        if(userinput == "Yazid"){           
            System.out.println("Hello Sir " );
        }
        else{
            System.out.println("Hello Sir " + userinput);
            
        }
    }
}

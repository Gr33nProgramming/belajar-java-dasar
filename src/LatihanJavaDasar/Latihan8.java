package LatihanJavaDasar;

public class Latihan8 {
    public static void main(String[] args){
        int a;
        
        String b = "////";
        
        for(a = 0; a < 23; a++){
            if(a <= 3){
                System.out.println(a + "." + "*");
            }
            else if(a > 3 && a % 2 == 1){
                System.out.println(a + "." + "*");
            }
            else if(a >= 4 && a % 2 == 0){                                
                System.out.println(a + "." + "*" + b + "*");              
                b+="/";
            }   
        }
        int x,y;
        for(x = 0; x <= 10; x++){
            for(y = x; y <= x ; y++){
                System.out.printf("[x = %d, y = %d] \n", x, y);               
            }
        }
    }
}

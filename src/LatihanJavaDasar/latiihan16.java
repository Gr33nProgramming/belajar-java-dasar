
package LatihanJavaDasar;


public class latiihan16 {
    public static void main(String[] args){
int j, i;
          for ( i = 0; i < 9; i++){
            for ( j = 0; j < 9; j++){
                if ( (i+j) > 12){
                    break;
                }
                else if ( (j >= 4) && (j-i) > 4){
                    break;
                }
                else if ( (j <= 4) && (i+j) < 4){
                    System.out.print("  ");
                    continue;
                }
                else if ( (i >= 4) && (i-j) > 4){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
         System.out.println();
         System.out.println();
       
        for( i = 1; i <= 10; i++) {
            for( j = i; j <= 10; j++){
               System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){               
                System.out.print("* ");               
            }
            for(int l = 2; l <= i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for( i = 2; i <= 10; i++) {
            for( j = 1; j <= i; j++){
               System.out.print("  ");
            }
            for(int k = i; k <= 10; k++){               
                System.out.print("* ");               
            }
            for(int l = i; l <= 9; l++){
                System.out.print("* ");
            }
            System.out.println();
        }          
    }
}

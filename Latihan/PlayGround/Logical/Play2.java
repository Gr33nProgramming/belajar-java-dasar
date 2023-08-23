package PlayGround.Logical;

public class Play2 {
    public static void main(String[] args) {
        reverseTriangle(5);
        normalTriangle(5);
    }
   private static void reverseTriangle(int value){
       for (int i = 1; i <= value; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("  ");
           }
           for (int k = i; k <= value; k++) {
               System.out.print("* ");
           }
           for (int l = i + 1; l <= value; l++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   private static void normalTriangle(int value){
       for (int i = 1; i <= value; i++) {
           for (int j = i; j <= value; j++) {
               System.out.print("  ");
           }
           for (int k = 1; k <= i; k++) {
               System.out.print("* ");
           }
           for (int l = 1; l <= i - 1; l++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}

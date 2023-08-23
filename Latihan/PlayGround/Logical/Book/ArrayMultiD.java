package PlayGround.Logical.Book;

public class ArrayMultiD {
    public static void main(String[] args) {
        array3D(6);
    }
    private static void array3D(int n){
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n - 1; col++) {
                if(row == n / 2 && col == n / 2){
                    System.out.print("? ");
                }else if((row >= 2 && row < n - 1) && (col >= 2 && col < n - 1)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

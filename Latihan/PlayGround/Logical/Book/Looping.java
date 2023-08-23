package PlayGround.Logical.Book;

public class Looping {
    public static void main(String[] args) {
        segitigaTerbalik(10);
    }
    static void segitigaTerbalik(int value){
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = value; k >= i; k--) {
                System.out.print("5 ");
            }
            System.out.println();
        }
    }
}

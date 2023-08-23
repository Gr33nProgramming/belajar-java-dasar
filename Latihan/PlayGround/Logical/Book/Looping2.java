package PlayGround.Logical.Book;

public class Looping2 {
    public static void main(String[] args) {
        jajarGenjang(5);
    }
    static void jajarGenjang(int value){
        for (int i = 1; i <= value; i++) {
            for (int j = value * 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= value * 2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

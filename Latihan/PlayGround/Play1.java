package PlayGround;

public class Play1 {
    private static void segitiga(int paramValue){
        for (int i = 1; i <= paramValue; i++) {
            for (int j = i; j <= paramValue; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        segitiga(5);
    }
}

package PlayGround.Logical.Book;

public class Grafik {
    public static void main(String[] args) {
        grafik();
    }
    static void grafik(){
        int[] arr = {27,18,10,7,5,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " : ");
            for (int j = 1; j <= arr[i]; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

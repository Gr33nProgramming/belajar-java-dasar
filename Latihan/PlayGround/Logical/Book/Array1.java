package PlayGround.Logical.Book;

public class Array1 {
    public static void main(String[] args) {
        total();
    }
    static void total(){
        int[] data = {4,1,2,2,3};
        int total = 1;
        for (int i = 0; i < data.length; i++) {
            total = total * data[i];
        }
        System.out.println(total);
    }
}

package PlayGround.Logical.Book;

public class Looping3 {
    static void kotak(int value){
        for (int i = 1; i < value; i++) {
            for (int j = 1; j <= value - 1; j++) {
                if(i == value / 2 && j == value / 2){
                    System.out.print("? ");
                }else if((i >= 2 && i < value - 1) && (j >= 2 && j < value - 1)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void kotakPejal(int value){
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if((i >= 2 && i < value) && (j >= 2 && j < value)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void hurufC(int value){
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if(j >= 1){
                    if(i > 1 && i < value){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        kotak(6);
        System.out.println();
        kotakPejal(5);
        System.out.println();
        hurufC(5);
    }
}

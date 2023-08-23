package PlayGround.Logical;

public class Logic1 {
    public static void main(String[] args) {
        angkaAngka(5);
    }
    private static void angkaAngka(int value){
        int n = value;
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row % 2 == 1){
                    System.out.print(i + " \t");
                    i++;
                }
            }
            if(row % 2 == 0){
                int num = i + n - 1;
                for (int col = 1; col <= n; col++) {
                    System.out.print(num + " \t");
                    num--;
                }
                i+= n;
            }
            System.out.println();
        }
    }
}

package PlayGround.Logical.Book;

public class LoopingDiamond {
    static void diamondStar(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n / 2; j >= i; j--) {
                System.out.print("   ");
            }
            for (int g = 1; g <= i; g++) {
                System.out.print(" * ");
            }
            for (int y = 2; y <= i; y++) {
                System.out.print(" * ");
            }
            if(i == n / 2){
                for (int k = 1; k <= n / 2; k++) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print("   ");
                    }
                    for (int f = n / 2; f >= k; f--) {
                        System.out.print(" * ");
                    }
                    for (int fa = n / 2; fa > k; fa--) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondStar(10);
    }
}

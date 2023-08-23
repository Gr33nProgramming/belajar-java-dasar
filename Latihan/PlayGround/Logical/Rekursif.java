package PlayGround.Logical;

public class Rekursif {
    private static int pangkat(int a, int b){
        if(a == 1){
            return a;
        }else{
            return pangkat(a - 1,b);
        }
    }
    public static void main(String[] args) {
        pangkat(2,4);
    }
}

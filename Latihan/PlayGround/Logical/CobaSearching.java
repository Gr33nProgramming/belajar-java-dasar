package PlayGround.Logical;
import java.util.Arrays;
public class CobaSearching {
    public static void main(String[] args) {
        arr();
    }
    static void arr(){
        int[] dataPertama = {1,4,5,2,7,9,6,4};
        int[] dataKedua = {3,2,4,5,6,1,4,3,2};
        int[] gabunganData = new int[dataPertama.length + dataKedua.length];
        Arrays.sort(dataPertama);
        for (int i = dataPertama.length - 1; i >= 0; i--) {
            System.out.print(dataPertama[i] + " ");
        }

//        for(int i = 0; i < gabunganData.length; i++){
//            for (int j = 0; j < dataPertama.length; j++) {
//
//            }
//            for (int k = 0; k < dataKedua.length; k++) {
//
//            }
//            System.out.print(gabunganData[i] + " ");
//        }
        System.out.println();
        for (int i = 0; i < dataPertama.length; i++) {
            System.out.print(dataPertama[i] + " ");
        }
        System.out.println();
        for (int g = 0; g < dataPertama.length; g++) {
            dataPertama[g] = dataPertama[(dataPertama.length - 1) - g];
            System.out.print(dataPertama[g] + " ");
        }
    }
}

package PlayGround.ArrayPractice;

public class CobaTiga {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,6,7,8};
        for (int i = 0; i < arr1.length; i++) {
           if(arr1[i] < arr1[i + 1]){
               System.out.println(arr1[i]);
           }
        }
    }
}

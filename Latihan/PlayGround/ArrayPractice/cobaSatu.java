package PlayGround.ArrayPractice;
import java.util.*;
public class cobaSatu {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,6,4};
        int[] arr2 = {8,9,6,1,5};
        ArrayList<Integer> arr3= new ArrayList<>();
        int[] arr4 = new int[arr1.length + arr2.length];

        for(int i : arr1){
            arr3.add(i);
        }
        for(int j : arr2){
            arr3.add(j);
        }
        for(int k : arr3){
            System.out.print(k + " ");
        }
        System.out.println();
        for (int a : arr1){
            arr4[a] = arr4[a] + arr1[a];
        }
        for(int b : arr2){
            arr4[b + arr1.length - 1] = arr2[b];
        }
        for (int g : arr4){
            System.out.print(arr4[g - 1]);
        }
    }
}

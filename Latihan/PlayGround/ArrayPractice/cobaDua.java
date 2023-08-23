package PlayGround.ArrayPractice;
import java.util.Scanner;
public class cobaDua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Masukkan index ke " + i + " : ");
            array1[i] = userInput.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        int[] array2 = new int[4];
        array2[0] = 6;
        System.out.println(array2[0]);
    }

}

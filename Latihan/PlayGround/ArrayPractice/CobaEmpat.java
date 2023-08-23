package PlayGround.ArrayPractice;
import java.util.Scanner;
public class CobaEmpat {
    private static void arrayDuaDimensi(){
        Scanner scanner = new Scanner(System.in);
        int[][] dataArray = new int[3][4];
        for (int row = 0; row < dataArray.length; row++) {
            for (int col = 0; col < dataArray[row].length; col++) {
                System.out.print("Data baris ke - " + (row + 1) + ", kolom ke - " + (col + 1) + " = ");
                dataArray[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Data pada matriks: ");
        for (int row = 0; row < dataArray.length; row++) {
            for (int col = 0; col < dataArray[row].length; col++) {
                System.out.print(dataArray[row][col] + " \t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        arrayDuaDimensi();
    }
}

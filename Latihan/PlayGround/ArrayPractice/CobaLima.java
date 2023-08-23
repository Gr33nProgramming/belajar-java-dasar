package PlayGround.ArrayPractice;

public class CobaLima {
    private static void matriks(){
        int[][] dataMatriks = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}};
        for (int row = 0; row < dataMatriks.length; row++) {
            for (int col = 0; col < dataMatriks[row].length; col++) {
                System.out.printf("Matriks [%d][%d] = %d\n",row,col,dataMatriks[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matriks();
    }
}

package PlayGround.Logical.Book;

import java.util.Scanner;
public class StringOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.print("Masukkan kata : ");
        userInput = input.nextLine();
        stringOps(userInput);
    }
    private static void stringOps(String paramInput){
        for (int i = 0; i < paramInput.length(); i++) {
            for (int j = paramInput.length() - 1; j >= paramInput.length() - 1 - i; j--) {
                System.out.print(paramInput.charAt(j));
            }
            System.out.println();
        }
    }
}

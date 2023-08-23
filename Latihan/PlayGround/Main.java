package PlayGround;

public class Main {
    public static void main(String[] args) {
        palindrome("Hello World");
        System.out.println();
        factorial(5);
        System.out.println(factorialRecursive(5));
        System.out.println(factorialTailRecursive(1,5));
    }
    static void palindrome(String value){
        for (int i = 1; i <= value.length(); i++) {
            System.out.print(value.charAt(i - 1));
        }
    }
    static void factorial(int value){
        int hasil = 1;
        for (int i = 1; i <= value; i++) {
            hasil = hasil * i;
        }
        System.out.println("Factorial " + value + " = " + hasil);
    }
    static int factorialRecursive(int value){
        if(value == 0){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }
    static int factorialTailRecursive(int totalValue, int value){
        if(value == 0){
            return totalValue;
        }else{
            return factorialTailRecursive(totalValue * value, value - 1);
        }
    }
}
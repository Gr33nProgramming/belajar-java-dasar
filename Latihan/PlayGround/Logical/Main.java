package PlayGround.Logical;

public class Main {
    public static void main(String[] args) {
        concat("Hello World");
    }
    static void concat(String value){
        String tampung = "";
        String tampung2 = "";
        for (int i = 0; i < value.length(); i++) {
            if(i <= value.length() / 2){

            }
            tampung = tampung + value.charAt(i);
        }
        System.out.println(tampung);
    }
}

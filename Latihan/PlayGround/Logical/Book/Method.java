package PlayGround.Logical.Book;

public class Method {
    public static void main(String[] args) {
        tampilkanDenganPemisah("ABCDE", "-");
    }
    static void tampilkanDenganPemisah(String paramValue, String paramValue2){
        for (int i = 0; i < paramValue.length(); i++) {
            System.out.print(paramValue.charAt(i));
            if(i < paramValue.length() - 1){
                System.out.print(paramValue2);
            }else{
                break;
            }
        }
    }
}

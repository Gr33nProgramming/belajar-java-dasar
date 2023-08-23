package ToDoListPZN;
import java.util.Scanner;
public class ToDoListApp {
    public static void main(String[] args) {
        layerViewToDoList();
    }

    public static String[] data = new String[10];
    public static String input(String info){
        Scanner scanner = new Scanner(System.in);
        System.out.print(info + " : ");
        var data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
        input("Nama");
    }

    /*
    Business Logic
     */
//    Logic menampilkan data
    public static void viewToDoList(){
        System.out.println("To Do List");
        System.out.println("\t-----");
        var tampungData = data;
        for (var i = 0; i < data.length; i++) {
            if(data[i] != null){
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }
    public static void testToDoList(){

//        viewToDoList();
    }
//    Logic menambahkan data
    public static void addToDoList(String dataToDo){
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                isFull = false;
                break;
            }
        }
        if(isFull){
            var temp = data;
            data = new String[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                data[i] = dataToDo;
                break;
            }
        }
    }
    public static void testAddToDolist(){
        for (int i = 0; i < 25; i++) {
            addToDoList("Contoh ke - " + i);
        }
        viewToDoList();
    }
//Logic menghapus data
    public static void removeToDoList(Integer number){
        if((number - 1) < 0 || (number - 1) >= data.length){
            System.out.println("Pilihan anda tidak tersedia");
        }else if(data[number - 1] == null){
            System.out.println("Data yang anda pilih kosong");
        }else{
            for (int i = (number - 1); i < data.length; i++) {
                if(i != (data.length - 1)){
                    data[i] = data[i + 1];
                }else{
                    data[i] = null;
                }
            }
            System.out.println("Data berhasil dihapus");
        }
    }
    public static void testRemoveToDoList(){
        for (int i = 0; i < data.length; i++) {
            addToDoList("Pilihan ke - " + (i + 1));
        }
        removeToDoList(6);
        viewToDoList();
    }
    /*
    View Logic
     */
//    Menampilkan layer view
    public static void layerViewToDoList(){
        while(true){
            viewToDoList();
            System.out.println("\t-----");
            System.out.println("1. Tambah To Do List");
            System.out.println("2. Hapus To Do List");
            System.out.println("x. Keluar");
            var inputUser = input("Masukkan pilihan anda");
            if(inputUser.equals("1")){
                layerAddToDoList();
            }else if(inputUser.equals("2")){
                layerRemoveToDoList();
            }else if(inputUser.equals("x")){
                break;
            }else{
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }
    public static void testLayerViewToDoList(){
        layerViewToDoList();
    }
//    Menampilkan layer add
    public static void layerAddToDoList(){
        var inputUser = input("Nama To Do (x jika batal)");
        if(inputUser.equals("x")){
            viewToDoList();
        }else{
            addToDoList(inputUser);
        }
    }
    public static void testLayerAddToDoList(){
        layerAddToDoList();
        viewToDoList();
    }
//    Menampilkan layer remove
    public static void layerRemoveToDoList(){
        var inputUser = input("Pilih yang ingin anda hapus (x jika batal)");
        if(inputUser.equals("x")){
            viewToDoList();
        }else{
            removeToDoList(Integer.valueOf(inputUser));
        }
        viewToDoList();
    }
    public static void testLayerRemoveToDoList(){
        addToDoList("satu");
        addToDoList("dua");
        layerRemoveToDoList();
    }
}

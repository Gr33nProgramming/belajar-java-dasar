package ToDoListPZN;

import java.util.Scanner;

public class ToDoListTest {
    public static void main(String[] args) {
        layerShowTodoList();
    }
    static String[] dataArray = new String[10];

    public static String input(String info){
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        return scanner.nextLine();
    }
//    Logic
    public static void showTodoList(){
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] !=null){
                System.out.printf("%d. %s \n", (i + 1), dataArray[i]);
            }
        }
    }
    public static void testShowTodoList(){
        showTodoList();
    }
    public static void addTodoList(String dataTodo){
        var isFull = true;
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] == null){
                isFull = false;
                break;
            }
        }
        if(isFull){
            var temp = dataArray;
            dataArray = new String[dataArray.length * 2];
            for (int i = 0; i < temp.length; i++) {
                dataArray[i] = temp[i];
            }
        }
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] == null){
                dataArray[i] = dataTodo;
                break;
            }
        }
    }
    public static void testAddTodoList(){
        for (int i = 0; i < 20; i++) {
            addTodoList("data ke - " + (i + 1));
        }
        showTodoList();
    }
    public static void removeTodoList(Integer index){
        if((index - 1) >= dataArray.length || (index - 1) < 0){
            System.out.println("Data tidak tersedia");
        }else if(dataArray[index - 1] == null){
            System.out.println("Pilihan anda tidak memiliki data");
        }else{
            for (int i = (index - 1); i < dataArray.length; i++) {
                if(i != dataArray.length - 1){
                    dataArray[i] = dataArray[i + 1];
                }else{
                    dataArray[i] = null;
                }
            }
        }
    }
    public static void testRemoveTodoList(){
        for (int i = 0; i < dataArray.length; i++) {
            addTodoList("Isi data ke - " + (i + 1));
        }
        removeTodoList(1);
        showTodoList();
    }

//  Layer
    public static void layerShowTodoList(){
        while(true){
            System.out.println("\nTo Do List");
            System.out.println("----------");
            if(dataArray != null){
                showTodoList();
            }else{
                System.out.println("Tidak ada task");
            }
            System.out.println("----------");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            var inputUser = input("Masukkan pilihan anda : ");
            if(inputUser.equalsIgnoreCase("1")){
                layerAddTodoList();
            }else if(inputUser.equalsIgnoreCase("2")){
                layerRemoveTodoList();
            }else if(inputUser.equalsIgnoreCase("x")){
                System.out.println("Terima Kasih");
                break;
            }else{
                System.out.println("Masukkan pilihan dengan benar ! ");
            }
        }
    }
    public static void testLayerShowTodoList(){
        layerShowTodoList();
    }
    public static void layerAddTodoList(){
        System.out.println("\nTambah Task");
        System.out.println("-------------");
        if(dataArray != null){
            showTodoList();
        }else{
            System.out.println("Tidak ada task");
        }
        System.out.println("-------------");
        var inputUser = input("Task Anda (x jika batal): ");
        if(inputUser.equalsIgnoreCase("x")){
            layerShowTodoList();
        }else{
            addTodoList(inputUser);
            layerShowTodoList();
        }
    }
    public static void testLayerAddTodoList(){
        layerAddTodoList();
    }
    public static void layerRemoveTodoList(){
        showTodoList();
        var inputUser = input("Pilih data yang ingin dihapus (x jika batal): ");
        if(inputUser.equalsIgnoreCase("x")){
            layerShowTodoList();
        }else{
            if(Integer.parseInt(inputUser) > dataArray.length || Integer.parseInt(inputUser) < 0){
                System.out.println("Pilihan anda tidak tersedia");
            }else{
                if(dataArray[Integer.parseInt(inputUser) - 1] != null){
                    removeTodoList(Integer.valueOf(inputUser));
                    System.out.println("Data berhasil dihapus");
                }else{
                    System.out.println("Data gagal dihapus");
                }
            }
        }
    }
    public static void testLayerRemoveTodoList(){

    }
}

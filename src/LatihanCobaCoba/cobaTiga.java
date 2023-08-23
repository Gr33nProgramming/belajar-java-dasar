package LatihanCobaCoba;

import java.util.*;

public class cobaTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> toDoList = new ArrayList <String>();
        int pilihanUser;
        String userTask;
        String confirm = " ";

        try{
            do{
                System.out.println("\nTO DO LIST");
                System.out.println("------------");
                System.out.println("Task anda");
                if(toDoList.size() == 0){
                    System.out.println("Anda belum memiliki task hari ini");
                    System.out.println("-----------");
                }else{
                    for(int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    System.out.println("-----------");
                }
                System.out.println("1. Tambahkan task");
                System.out.println("2. Hapus task");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan anda : ");
                pilihanUser = input.nextInt();input.nextLine();
                do{
                    if(pilihanUser == 1){
                        System.out.print("Masukkan task : ");
                        userTask = input.nextLine();
                        toDoList.add(userTask.toUpperCase());
                        System.out.print("Apakah anda ingin menambahkan task lagi ? (y / n) : ");
                        confirm = input.nextLine();
                    }
                }while(confirm.equalsIgnoreCase("y"));
                do{
                    if(pilihanUser == 2){
                        if(toDoList.size() == 0){
                            System.out.println("Anda belum memiliki task");
                        }else{
                            for(int j = 0; j < toDoList.size(); j++) {
                                System.out.println((j + 1) + ". " + toDoList.get(j));
                            }
                        System.out.print("Pilih task yang ingin anda hapus : ");
                        pilihanUser = input.nextInt();input.nextLine();
                        if(pilihanUser > toDoList.size() || pilihanUser <= 0){
                            System.out.println("Pilihan anda tidak tersedia");
                        }
                        toDoList.remove(pilihanUser - 1);
                        }
                        if(toDoList.size() > 0){
                            System.out.print("Apakah anda ingin menghapus task lagi (y/n)? :");
                            confirm = input.nextLine();
                        }
                    }
                }while(confirm.equalsIgnoreCase("y"));
                if(pilihanUser == 3){
                    break;
                }
            }while(confirm.equalsIgnoreCase("n"));
            System.out.println("TerimaKasih :)");
        }catch(Exception e){
            System.err.println("Error !");
        }
    }
}
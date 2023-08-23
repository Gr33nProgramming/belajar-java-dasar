package LatihanJavaDasar_lanjutan;

import java.util.HashMap;

public class latihan6_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapping = new HashMap<>();
        mapping.put(1, "Minggu");
        mapping.put(2, "Senin");
        mapping.put(3, "Selasa");
        mapping.put(4, "Rabu");
        mapping.put(5, "Kamis");
        mapping.put(6, "Jum'at");
        mapping.put(7, "Sabtu");
        System.out.println(mapping.get(2) + " Adalah Hari Sibuk");
        System.out.println(mapping.get(6) + " Berkah");
        System.out.println("Isi objek mapping : \n" + mapping);
        

    }
}

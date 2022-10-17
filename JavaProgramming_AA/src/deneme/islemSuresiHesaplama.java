package deneme;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class islemSuresiHesaplama {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList", arrayList);

    }
    public static void zamanHesapla(String veriTipi, List<Integer> list){
        //Listin sonuna deger ekleme

        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " ekleme suresi " + (bitis - baslangic) + " ms");

    }

}

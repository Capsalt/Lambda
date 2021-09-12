package Examples;

import java.util.HashMap;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        HashMap<Integer,HashMap<String,String>> kisiListesi=new HashMap<>();

        HashMap<String,String> kisiBilgileri = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("tc gir");
        int kimlikNo = scan.nextInt();

        System.out.println("ad soyad gir");
        String ad = scan.next();

        System.out.println("adres");
        String adres = scan.next();

        System.out.println("tel");
        String tel = scan.next();

        kisiBilgileri.put("ad",ad);
        kisiBilgileri.put("adres",adres);
        kisiBilgileri.put("tel", tel);

        kisiListesi.put(kimlikNo, kisiBilgileri);
        System.out.println(kisiBilgileri);
        System.out.println(kisiListesi);

    }
}

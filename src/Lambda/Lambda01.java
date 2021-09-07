package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,12,35,2,51,2,54,153,3,4,3));

        yazdirJava(list);
        System.out.println();
        yazdirLambda(list);
        System.out.println();
        ciftSayiYazdir(list);
        System.out.println();
        küplerinCarpimi(list);
        System.out.println();
        yarisi(list);

    }

    public static void yarisi(List<Integer> list) {
        List<Integer> sonList = list.stream().distinct().filter(t -> t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonList);
    }

    public static void küplerinCarpimi(List<Integer> list) {
       int sayi= list.stream().distinct().filter(t -> t%2==0 ).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(sayi);
    }

    public static void ciftSayiYazdir(List<Integer> list) {
        list.stream().filter(t -> t%2==0 ).forEach(t -> System.out.print(t + " ") );
    }

    public static void yazdirJava(List<Integer> list) {

        for (Integer w: list) {
            System.out.print(w+ " ");
        }
    }

    public static void yazdirLambda(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+ " "));
    }
}

package Lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambda01 {

    public static void main(String[] args) {

        List<Integer>l=new ArrayList<>(Arrays.asList(14,9,13,4,9,2,4,14,15));

        yazdırJava(l);
        System.out.println();
        yazdırLambda(l);
        System.out.println();
        ciftSayıJava(l);
        System.out.println();
        ciftSayıLambda(l);
        System.out.println();
        tekSayıKareLabmda(l);
        System.out.println();
        tekrarlayanEleman(l);
        System.out.println();
        listeLambda(l);
        System.out.println();
        listeCarpım(l);
        System.out.println();
        listeSıralaTersYazdır(l);





    }
    //7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır

   public static void listeSıralaTersYazdır(List<Integer> l) {

        l.stream().sorted().forEach(t-> System.out.print(t+" ")); // 2 4 4 9 9 13 14 14 15
       System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" ")); // 15 14 14 13 9 9 4 4 2


    }
    //6)Listedeki tekrarlı elemanları silip çift sayı olanların küplerinin çarpımını yazdıran metod oluştur


    public static void listeCarpım(List<Integer> l) {

        System.out.print(l.stream().distinct().filter(t-> t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y)); // 1404928
    }



// 5.Listedek tekrarlı elemanları silip çift sayı olanların karelerinin
    // toplamını yazdıran method olustur

    public static void listeLambda(List<Integer> l) {

        int sayı= l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0,(x, y)->x+y); // 216
        System.out.println(sayı);
    }

    // 4.tekrarlı elemanları silip teksayıları isteyip küplerini yazdıran kod yazın
    public static void tekrarlayanEleman(List<Integer> l) {

        l.stream().distinct().filter(t-> t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); // 729 2197 3375
    }

    // 3. Listedeki tek sayıların karelerini yazdıran method oluşturur.

    public static void tekSayıKareLabmda(List<Integer> l) {

        l.stream().filter(t-> t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));  // 81 169 81 225
    }

// 2)List in elemanlarından ÇİFT olanları aralarında boşluk bırakarak yazdıran metod oluştur(Structured)
// Lambd expression(-> arrow fuction)

    private static void ciftSayıLambda(List<Integer> l) {

        l.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));

    }

    private static void ciftSayıJava(List<Integer> l) {

        for(Integer w:l) {
            if(w%2==0){
                System.out.print(w+" "); // 14 4 2 4 14
            }
        }
    }

    // 1. list'in elemanlarını yanyana yazdır (java-structured)
    public static void yazdırJava(List<Integer> l) {
        for(Integer w:l){
            System.out.print(w+" ");
        }
    }

    // labda(fuctional)
    public static void yazdırLambda(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t+" ")); // 14 9 13 4 9 2 4 14 15

    }


}

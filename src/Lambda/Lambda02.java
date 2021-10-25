package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        //1)List in elemanlarını aralarında boşluk bırakarak yanyana yazdır.(Method Reference- kendi metodumuz)

        List<Integer> l = new ArrayList<>(Arrays.asList(15, 14, 9, 13, 4, 9, 2, 4, 14, 6));

        elemanYazdir(l);
        System.out.println();
        ciftSayiYazdir(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        tekSayiKüpTekrarsiz(l);
        System.out.println();
        farklıCiftSayıKareToplam(l);
        System.out.println();
        farklıCiftSayiKupCarpim(l);
        System.out.println();
        farklıTersSırala(l);
        System.out.println();
        maxDeger(l);
    }




    public static void elemanYazdir(List<Integer> l) {


        l.stream().forEach(metodLambda2::bosluklaYazdır); // kendi methodunuz 15 14 9 13 4 9 2 4 14
    }

    public static void ciftSayiYazdir(List<Integer> l) {

        l.stream().filter(metodLambda2::ciftMi).forEach(metodLambda2::bosluklaYazdır); // 14 4 2 4 14
    }

    //3)List teki tek sayıların karelerini alıp aralarında boşluk bırakarak yanyana yazdır

    public static void tekSayiKare(List<Integer> l) {

        l.stream().filter(metodLambda2::tekMi).map(metodLambda2::kareAl).forEach(metodLambda2::bosluklaYazdır); // 225 81 169 81

    }

    // 4) Listteki tekrarlı olanları silip tek sayıların küplerini alıp oralarında boşluk bırakarak yanyana yazınız.

    public static void tekSayiKüpTekrarsiz(List<Integer> l) {

        l.stream().distinct().filter(metodLambda2::tekMi).map(metodLambda2::kupAl).forEach(metodLambda2::bosluklaYazdır); // 3375 729 2197


    }

    //5)Farklı çift sayıların karelerinin toplamını yazdır (Use Method Reference)

    private static void farklıCiftSayıKareToplam(List<Integer> l) {

        int num = l.stream().distinct().filter(metodLambda2::ciftMi).map(metodLambda2::kareAl).reduce(0, Math::addExact);
        System.out.println(num); // 252


    }

    //5)Farklı çift sayıların küplerinin toplamını yazdır (Use Method Reference)
    public static void farklıCiftSayiKupCarpim(List<Integer> l) {

        int num1 = l.stream().distinct().filter(metodLambda2::ciftMi).map(metodLambda2::kupAl).reduce(1, Math::multiplyExact);

        System.out.println(num1); // 1404928
    }

    //10)List teki farklı ve 5 ten büyük elemanlarının yarısını alıp  ters olarak ve list şeklinde yazdır.

    public static void farklıTersSırala(List<Integer> l) {

       l.stream().distinct().filter(t->t>5 && t%2==0).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // 303464448


    }

    // 8.Listteki en büyük elemanı bul(use method referance)

    private static void maxDeger(List<Integer> l) {

        System.out.println(l.stream().reduce(Integer.MIN_VALUE, Math::max)); //15
        System.out.println(l.stream().reduce(Integer.MAX_VALUE, Math::min)); //2

        l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(metodLambda2::bosluklaYazdır); // en büyük
        l.stream().sorted().limit(1).forEach(metodLambda2::bosluklaYazdır); // en küçük


    }

}
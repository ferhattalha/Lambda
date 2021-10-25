package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Lambda04 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>(Arrays.asList("Ali", "Ali", "Aysima", "Abdurrahman", "Mehmet", "Mustafa", "Bedirhan", "Yüksel", "Süleyman"));
        yazdirBuyuk(l);
        System.out.println();
        uzunlukSıralaYazdir(l);
        System.out.println();
        farklıSonHarfSırala(l);
        System.out.println();
        uzunlukSıralaIlkEleman(l);
        System.out.println();
        yazdirAİleBaslayan(l);
        System.out.println();
        AbaslaVeyaİBit(l);
        System.out.println();
        sıralaBuyut(l);
        System.out.println();
        isimUzunlukSirala(l);
        System.out.println();
        kareSıralaSil(l);
        System.out.println();
        ebikGabık(l);
        System.out.println();
        sondanIkinciSıralaIlk(l);
        System.out.println();
        terstenSiralaIlkYazdir(l);

    }




    // 1. List'in elemanlarını büyük harfle yazdır.


    private static void yazdirBuyuk(List<String> l) {

        l.stream().map(t->t.toUpperCase()).forEach(metodLambda2::bosluklaYazdır); // ALİ ALİ AYSİMA ABDURRAHMAN MEHMET MUSTAFA BEDİRHAN YÜKSEL SÜLEYMAN
        System.out.println();
        l.stream().map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdır); // ALİ ALİ AYSİMA ABDURRAHMAN MEHMET MUSTAFA BEDİRHAN YÜKSEL SÜLEYMAN

    }



//2) elemanları uzunluklarına göre sırala ve yazdır

    private static void uzunlukSıralaYazdir(List<String> l) {

     l.stream().sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYazdır); // Ali Ali Aysima Mehmet Yüksel Mustafa Bedirhan Süleyman Abdurrahman

        System.out.println();

     l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(metodLambda2::bosluklaYazdır);// Abdurrahman Bedirhan Süleyman Mustafa Aysima Mehmet Yüksel Ali Ali
}


    // 3) farklı elemanlarını son harflerine göre sıralayıp yazdır


    private static void farklıSonHarfSırala(List<String> l) {

        l.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(metodLambda2::bosluklaYazdır); // Aysima Mustafa Ali Yüksel Abdurrahman Bedirhan Süleyman Mehmet

}


//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun


    private static void uzunlukSıralaIlkEleman(List<String> l) {

        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(metodLambda2::bosluklaYazdır); // Ali Ali Aysima Mehmet Yüksel Mustafa Bedirhan Süleyman Abdurrahman

        System.out.println();

        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1)).thenComparing(t->t.substring(1,2))).forEach(metodLambda2::bosluklaYazdır);

}
    //6)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun    */
    private static void yazdirAİleBaslayan(List<String> l) {

        l.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdır); // ALİ ALİ AYSİMA ABDURRAHMAN


    }

    // 7.//7)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
    private static void AbaslaVeyaİBit(List<String> l) {

        l.stream().filter(t->t.startsWith("A") || t.endsWith("i")).map(String::toLowerCase).forEach(metodLambda2::bosluklaYazdır); // ali ali aysima abdurrahman

        // method referance ile yapardsak komutların içine sadece bir işlem atabiliriz.arrow (->)function da && || larla istedigimiz kadar işlem yapabiliriz

    }
    // 7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun

    private static void sıralaBuyut(List<String> l) {

        l.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdır);// ALİ ALİ AYSİMA MEHMET YÜKSEL MUSTAFA BEDİRHAN SÜLEYMAN ABDURRAHMAN

    }

//  8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın


    private static void isimUzunlukSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).map(t->t+":"+t.length()).forEach(metodLambda2::bosluklaYazdır); // Ali:3 Ali:3 Aysima:6 Mehmet:6 Yüksel:6 Mustafa:7 Bedirhan:8 Süleyman:8 Abdurrahman:11

}
//9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın

    private static void kareSıralaSil(List<String> l) {

        l.stream().map(t->t.length()*t.length()).filter(t->t>20).distinct().sorted(Comparator.reverseOrder()).forEach(metodLambda2::bosluklaYazdır); // 121 64 49 36
    }

//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
//bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
//en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.

    private static void ebikGabık(List<String> l) {
    boolean result=  l.stream().allMatch(t->t.length()>12);
        System.out.println("elemanların uzunlukları 12'den küçük mü :"+ result); // false

        boolean result1=  l.stream().noneMatch(t->t.startsWith("x"));
        System.out.println("x ile başlayan öge yok :"+ result1);        // true

     boolean result3= l.stream().anyMatch(t->t.endsWith("R"));
        System.out.println("Elemanlardan herhangi biri r ile bitiyor mu : "+result3); // false

    }
   //  elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır

    private static void sondanIkinciSıralaIlk(List<String> l) {

        System.out.println(l.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst()); // Optional[Abdurrahman]


    }
   // elemanları uzunluklarına göre terstern sıralayıp ilk elemanı yazdır
    private static void terstenSiralaIlkYazdir(List<String> l) {

        System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
        // Eleman "A",'a' ile başlıyor veya "N" ,'n' ile bitiyorsa o elemanı silin.
        l.removeIf(t->t.toUpperCase().startsWith("A")||t.toUpperCase().endsWith("N"));
        System.out.println(l);// [Mehmet, Mustafa, Yüksel]
}
}



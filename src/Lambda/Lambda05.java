package Lambda;

import java.util.stream.IntStream;

public class Lambda05 {

    public static void main(String[] args) {

        // 1- 1'den 20'ye kadar olan sayıları yazdır
        IntStream.rangeClosed(1,35).forEach(metodLambda2::bosluklaYazdır); //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35


        //2) functional programlamayı kullanarak 3 den ile 98 e kadar olan çift tam sayıların toplamını bulun

        System.out.println(IntStream.rangeClosed(3, 98).filter(metodLambda2::ciftMi).sum()); // 2448

        //3) functional programming kullanarak 9! i bul (9!=1*2*3...*9)

        System.out.println(IntStream.rangeClosed(1,10).reduce(1,Math::multiplyExact)); // 3628800


         // 4) İlk 7 çift sayma sayısının çarpımını bulun (2,4,6,8,10,12,14)

        System.out.println(IntStream.rangeClosed(2,14).filter(metodLambda2::ciftMi).reduce(1,Math::multiplyExact)); // 645120

        //6)  6'dan büyük ilk 15 tek sayma sayısının toplamını bulun ==> 7, 9, 11, 13, 15, 17, 19

        System.out.println(IntStream.iterate(7,t->t+2).limit(15).sum()); // 23400

        //7) İlk 23 tek sayma sayısının toplamını bulun

        System.out.println(IntStream.iterate(2,t->t+2).limit(23).sum()); // 552

        //8)  (11'den 33 e kadar) arasındaki her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun

       IntStream.rangeClosed(11,33).map(metodLambda2::rakamlarToplamı).forEach(metodLambda2::bosluklaYazdır); // 2 3 4 5 6 7 8 9 10 2 3 4 5 6 7 8 9 10 11 3 4 5 6

        }

    }



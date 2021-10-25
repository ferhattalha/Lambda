package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(7, 12, 14, 4, 9, 2, 4, 12, 16));

        ilkDörtEleman(l);
        System.out.println();
        ilkDörtElemanGec(l);
        ucElemanYazdir(l);

    }



    //1. Küçükten büyüge sırala ve ilk dört elemanı yazdır

    private static void ilkDörtEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYazdır); // 2 4 4 7

    }

    // 2. Küçükten büyüge sırala ve ilk dört elemanı atla
    private static void ilkDörtElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYazdır); // 9 12 12 14 16
    }


    private static void ucElemanYazdir(List<Integer> l) {

        l.stream().sorted().skip(3).limit(3).forEach(metodLambda2::bosluklaYazdır); // 9 12 12 14 16 7 9 12
        System.out.println();
        l.stream().sorted().limit(6).skip(3).forEach(metodLambda2::bosluklaYazdır); // 7 9 12
    }

}


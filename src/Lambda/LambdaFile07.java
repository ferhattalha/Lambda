package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaFile07 {

    public static void main(String[] args) {

        try {

            Files.lines(Paths.get("C:\\Users\\HP 250 G5\\eclipse-workspace\\Lambda\\src\\Lambda\\LambdaFile01")).forEach(t -> System.out.println(t));

        } catch (IOException e) {
            System.out.println(e);
        }


        try {

            Files.lines(Paths.get("C:\\Users\\HP 250 G5\\eclipse-workspace\\Lambda\\src\\Lambda\\LambdaFile01")).map(String::toUpperCase).forEach(t -> System.out.println(t));

        } catch (IOException e) {
            System.out.println(e);

        }

        //metindeki farklı kelimeleri yazdır

        try {
            Files.lines(Paths.get("C:\\Users\\HP 250 G5\\eclipse-workspace\\Lambda\\src\\Lambda\\LambdaFile01")).map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            Files.lines(Paths.get("C:\\Users\\HP 250 G5\\eclipse-workspace\\Lambda\\src\\Lambda\\LambdaFile01")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
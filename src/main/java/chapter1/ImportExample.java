package chapter1;

import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Random r = new Random();

        int r1 = r.nextInt(5, 11);

        // System.out.println(r.nextInt(11));
        System.out.println("r1 = " + r1);
    }
    
}

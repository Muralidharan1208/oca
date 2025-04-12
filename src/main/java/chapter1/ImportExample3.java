package chapter1;

import p1.ch1.*;

public class ImportExample3 {
    public static void main(String[] args) {
        Ch01 c = new Ch01();

        c.example();

        c.example2("Murali");

        String s = c.example3("Murali");

        System.out.println(s);
    }
}

package chapter1;

import p1.*;

public class ImportExample2 {
    public static void main(String[] args) {
        C11 c = new C11();

        c.example();

        c.example2("Murali");

        String s = c.example3("Murali");

        System.out.println(s);
    }
}

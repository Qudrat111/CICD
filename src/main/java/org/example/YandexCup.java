package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class YandexCup {
    public static void main(String[] args) throws IOException {
        BufferedWriter in = new BufferedWriter(new OutputStreamWriter(System.out), 1024 * 1024);

        in.write("rrrr");

        in.flush();

        System.out.println(in);
    }
}

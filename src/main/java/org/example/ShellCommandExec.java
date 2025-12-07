package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellCommandExec {
    public static void main(String[] args) {
        String gnomeOpenCommand = "gnome-open //home//user//Documents//MyDoc.pdf";

        try {
            Runtime rt = Runtime.getRuntime();
            Process processObj = rt.exec(gnomeOpenCommand);

            InputStream stdin = processObj.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);

            String myoutput = "";

            while ((myoutput = br.readLine()) != null) {
                myoutput += myoutput + "\n";
            }
            System.out.println(myoutput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

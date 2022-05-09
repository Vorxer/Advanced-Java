package io;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) {

        File myfile = new File("src/main/example.txt");
        System.out.println(myfile.getAbsolutePath());
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(myfile));
            String line;
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package filesAndDirs;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CreateFileExample {

    public static void main(String[] args) {

        Random r = new Random();
        String fileName = "File-" + r.nextInt() + "-" + r.nextInt()+".txt";

        File myFile = new File("files/"+fileName);
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package filesAndDirs;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {



    public static void main(String[] args) {

        FilenameFilter filenameFilter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String[] contents = new File(".").list(filenameFilter);
        for (String c: contents) {
            System.out.println(c);
        }

        new File("exampleDir").mkdir();
    }
}

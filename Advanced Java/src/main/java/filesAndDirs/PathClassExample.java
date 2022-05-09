package filesAndDirs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class PathClassExample {

    public static void main(String[] args) {
        Path path = Paths.get("HelloWorld.txt");

        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path path2 = Paths.get("C:\\Users\\DinuraSeneviratne\\IdeaProjects\\Advanced Java\\pom.xml");

        System.out.println(path2.toAbsolutePath());
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
        System.out.println(path2.getFileSystem());

        Path dest = Paths.get("C:\\Users\\DinuraSeneviratne\\IdeaProjects\\Advanced Java\\pom.txt");
        try {
            Files.copy(path2,dest, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

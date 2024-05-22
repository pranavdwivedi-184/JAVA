import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        try {
            File obj = new File("dwivedi/pranavdwivedi.cpp");
            System.out.println("hello");

            obj.createNewFile();

            if (obj.exists()) {
                System.out.println("file exists = " + obj.getName());
            } else {
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}

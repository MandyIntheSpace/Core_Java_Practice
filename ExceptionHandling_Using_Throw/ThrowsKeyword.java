package ExceptionHandling_Using_Throw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
    public static void finalFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.finalFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());

        }
    }
}
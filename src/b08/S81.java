package b08;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class S81 {
    public static void main(String[] args) {
        File dir = new File("/tmp");
        File f1 = new File("c:/tmp/hello.txt");
        File f2 = new File("/tmp", "hello.txt");
        File f3 = new File(dir, "hello.txt");

        try {
            File f4 = new File(new URI("file:///C://tmp/hello.txt")); //URI tira un'eccezione
            System.out.println("Does the file exist? " + f4.exists());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        System.out.println("Is /tmp a directory? " + dir.isDirectory());
        System.out.println("Is /tmp/hello.txt a file? " + f1.isFile());
        System.out.println("Is /tmp/hello.txt hidden? " + f2.isHidden());
        System.out.println("Can /tmp/hello.txt be read? " + f3.canRead());
        System.out.println("Can /tmp/hello.txt be written? " + f1.canWrite());
        System.out.println("Can /tmp/hello.txt be executed? " + f2.canExecute());
        System.out.println("Is c:/tmp/hello.txt absolute? " + f1.isAbsolute());
        System.out.println("Is /tmp/hello.txt absolute? " + f2.isAbsolute());
        
        System.out.println("Name: " + f1.getName());
        System.out.println("Path: " + f2.getPath());
        System.out.println("Absolute path: " + f2.getAbsolutePath());
        System.out.println("Parent: " + f3.getParent());
        System.out.println("Last modified: " + f1.lastModified());
        System.out.println("Length: " + f1.length());
        System.out.println("List: " + Arrays.toString(dir.list()));
    }
}

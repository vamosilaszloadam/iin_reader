import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Readfile implements Readable {

    @Override
    public void readContent() {
        try {
            tryReadContent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void tryReadContent() throws IOException {
        File file = new File("adat.txt");
        Scanner sc = new Scanner(file, Charset.forName("utf8"));
        StringBuffer sb = new StringBuffer();
        while(sc.hasNextLine()){
            sb.append(sc.nextLine());
            sb.append('\n');
        }
        String content = sb.toString();
        System.out.println("Tartalom: ");
        System.out.println(content);
        sc.close();
    }

}
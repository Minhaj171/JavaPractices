import javax.security.auth.login.FailedLoginException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {
    public static void main(String[] args) throws IOException {
     try {
         FileReader fileReader = new FileReader("helloJava.txt");
         int readerData = fileReader.read();

          while (readerData != -1){
             System.out.print((char) readerData);
              readerData = fileReader.read();
         }
         fileReader.close();
     } catch (IOException e){
         e.printStackTrace();
     }

    }
}

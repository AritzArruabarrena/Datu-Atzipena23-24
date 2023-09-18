package dambi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//Hemengo honetan xanadu irakurriko du eta outagain sortu bertan idatziz, baina xanadu ez badu aurkitzen try-catch-ak salto egingo du
public class CopyBytesFNEKontrolatuz {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Xanadu ez da aurkitu");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        }
    }
}

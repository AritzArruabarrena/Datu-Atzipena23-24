package dambi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Programa hone xanadu.txt irakurriko du, ondoren outagain sortuko du (fileoutputStream erabitzen da sortzeko) eta ondoren irakurri ostean outagain.txt archiboan berdina idatziko du
public class CopyBytes {
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


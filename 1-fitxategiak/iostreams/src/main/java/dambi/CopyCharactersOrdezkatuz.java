package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutputo.txt");
            
            int c;
            while ((c = inputStream.read()) != -1) {
                char letraaldaketa = (char) c;//char almacena cualquier caractere 
                if(letraaldaketa == 'a'){
                    letraaldaketa = 'o';
                }
                outputStream.write(letraaldaketa);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

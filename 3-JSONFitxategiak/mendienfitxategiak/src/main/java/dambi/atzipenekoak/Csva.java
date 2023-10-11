package dambi.atzipenekoak;

import dambi.pojoak.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csva {

    public String strFileIn;
    public String strFileOut;

    public void Csva(String fileIn) {
        this.strFileIn = fileIn;
    }

    public void Csva(String fileIn, String fileOut) {
        this.strFileIn = fileIn;
        this.strFileOut = fileOut;
    }

    public Mendiak irakurri() {

        String split = ";";
        String ilara = "";
        ArrayList mendiakArrayList = new ArrayList<Mendia>();
        try {
            BufferedReader ireki = new BufferedReader(new FileReader(strFileIn));
            ireki.readLine();// lenengoko lerroa jan egiten du

            while ((ilara = ireki.readLine()) != null) {
                String[] mendiadatuak = ilara.split(split);

                Mendia mendia = new Mendia(Integer.parseInt(mendiadatuak[0]), mendiadatuak[1],
                        Integer.parseInt(mendiadatuak[2]), mendiadatuak[3]);
                mendiakArrayList.add(mendia);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Mendiak fitxategia ez du aurkitu");
        } catch (IOException e) {

        }
        return new Mendiak(mendiakArrayList);
    }

    public int idatzi(Mendiak mendiak) {
        List<Mendiak> mendiaList = (List<Mendiak>) irakurri();
        int i = 0;

        try (FileWriter idatzi = new FileWriter(strFileOut)) {
            
            for(Mendiak mendia : mendiaList){
                idatzi.append(mendia.getMendiak().get(i).getId() + ";" + mendia.getMendiak().get(i).getMendia() + ";" + mendia.getMendiak().get(i).getAltuera() + ";" + mendia.getMendiak().get(i).getProbintzia() + "\n");
                i++;
            }

        } catch(IOException ex){

        }
        return i;
    }
}

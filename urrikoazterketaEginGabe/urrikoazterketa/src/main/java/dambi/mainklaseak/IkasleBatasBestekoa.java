package dambi.mainklaseak;

import java.util.Scanner;

import dambi.atzipenekoak.Csva;
import dambi.pojoak.Nota;
import dambi.pojoak.Notak;

public class IkasleBatasBestekoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float guztira = 0;
        float batazbestekonota = 0;
        Notak notak = new Notak();
        Csva csva = new Csva("data/Notak.csv");
        notak = csva.irakurri();
        System.out.println("Zein ikasleren batezbestekoa nahi duzu irakurri? ");
        String ikaslea = in.next();
        if (notak != null) {
            int kont = 0; 
            for (Nota n : notak.getNotak()) {
                if (ikaslea.equals(n.getIkaslea())) {
                    guztira = guztira + n.getNota();
                    kont++; 
                }
            }
            if (kont > 0) { 
                batazbestekonota = guztira / kont;
                System.out.println(ikaslea + " ikaslearen batazbestekoa nota: " + batazbestekonota);
            } else {
                System.out.println("Ez da ikasle horren notarik aurkitu.");
            }
        } else {
            System.out.println("Ez da notak kargatu.");
        }
    }        
}

package dambi.mainklaseak;

import dambi.atzipenekoak.Csva;
import dambi.atzipenekoak.Xmla;
import dambi.pojoak.Nota;
import dambi.pojoak.Notak;

public class NotakIgo {
    public static void main(String[] args) {

        Notak notak = new Notak();
        Notak notaberria = new Notak();
        Csva csva = new Csva("data/Notak.csv");
        Xmla xmla = new Xmla("","data/NotaHobetuta.xml");
        notak = csva.irakurri();
        if (notak != null) {
            for (Nota n : notak.getNotak()) {
                if ((int) n.getNota() < 10) {
                    n.setNota(n.getNota() + 1);
                    notaberria.add(n);

                }
                System.out.println(xmla.idatzi(notaberria) + "dana bukatuta");
            }
        }
    }
}

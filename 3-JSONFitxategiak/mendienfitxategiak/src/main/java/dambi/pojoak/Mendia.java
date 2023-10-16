package dambi.pojoak;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "id" , "mendia", "altuera", "probintzia" })
@XmlRootElement(name = "Mendia")
public class Mendia {
    private int id;
    private String mendia;
    private int altuera;
    private String probintzia; 
    

    public Mendia(int id, String mendia, int altuera, String probintzia) {
        this.id = id;
        this.mendia = mendia;
        this.altuera = altuera;
        this.probintzia = probintzia;
    }

    public int getId() {
        return id;
    }
    @XmlElement(name = "Mendia_Id")
    public void setId(int id) {
        this.id = id;
    }

    public String getMendia() {
        return mendia;
    }

    @XmlElement(name = "Mendia_Mendia")
    public void setMendia(String mendia) {
        this.mendia = mendia;
    }

    public int getAltuera() {
        return altuera;
    }

    @XmlElement(name = "Mendia_Altuera")
    public void setAltuera(int altuera) {
        this.altuera = altuera;
    }

    public String getProbintzia() {
        return probintzia;
    }

    @XmlElement(name = "Mendia_Probintzia")
    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    
}

package dambi;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "mendia", "altuera", "probintzia" })
@XmlRootElement(name = "Mendiak")
public class Mendia {
    String mendia;

    String altuera;

    String probintzia;

    public Mendia() {
    }

    public Mendia(String mendia, String altuera, String probintzia) {
        this.mendia = mendia;
        this.altuera = altuera;
        this.probintzia = probintzia;
    }

    public String getMendia() {
        return mendia;
    }

    @XmlElement(name = "Mendiak_Mendia")
    public void setMendia(String mendia) {
        this.mendia = mendia;
    }

    public String getAltuera() {
        return altuera;
    }

    @XmlElement(name = "Mendiak_Altuera")
    public void setAltuera(String altuera) {
        this.altuera = altuera;
    }


    public String  getProbintzia(){
        return probintzia;
    }

    @XmlElement(name  = "Menidak_Probintzia")
    public void setProbintzia(String probintzia){
        this.probintzia = probintzia;
    }
    

}

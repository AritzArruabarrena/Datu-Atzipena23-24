package dambi.pojoak;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mendiak")
public class Mendiak {

    List<Mendia> mendiak;

    public List<Mendia> getMendiak() {
        return mendiak;
    }

    @XmlElement(name = "Mendia")
    public void setMendiak(List<Mendia> mendiak) {
        this.mendiak = mendiak;
    }

    public void add(Mendia mendia) {
        if (this.mendiak == null) {
            this.mendiak = new ArrayList<Mendia>();
        }
        this.mendiak.add(mendia);

    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Mendia m : this.mendiak) {
            str.append(m.toString());
            str.append("\n");
        }
        return str.toString();
    }

}
package dambi;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mendiak")
public class MendiaList {

     List<Mendia> mendiak;

    public List<Mendia> getMendiak() {
        return mendiak;
    }
    public void setMendiak(List<Mendia> mendiak) {
        this.mendiak = mendiak;
    }
    public void add( Mendia mendia )
    {
        if( this.mendiak == null )
        {
            this.mendiak = new ArrayList<Mendia>();
        }
        this.mendiak.add(mendia);

    
}
}
package dambi.pojoak;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement( name = "Mendiak" )

public class Mendiak {
 public List<Mendia> mendiak;

public Mendiak(List<Mendia> mendiak) {
    this.mendiak = mendiak;
}

public List<Mendia> getMendiak() {
    return mendiak;
}

@XmlElement( name = "Mendia" )
public void setMendiak(List<Mendia> mendiak) {
    this.mendiak = mendiak;
}  

  
}

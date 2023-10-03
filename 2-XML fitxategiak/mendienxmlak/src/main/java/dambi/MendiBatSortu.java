package dambi;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MendiBatSortu {
    public static void main(String[] args) {
        try {

            Mendia arrate = new Mendia();
            arrate.setMendia("Arrate");
            arrate.setAltuera("556");
            arrate.setProbintzia("Gipuzkoa");

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance(Mendia.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            /* marshaling of java objects in xml (output to file and standard output) */
            jaxbMarshaller.marshal(arrate, new File("arrate.xml"));
            jaxbMarshaller.marshal(arrate, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

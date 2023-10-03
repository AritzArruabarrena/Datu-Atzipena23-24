package dambi;

import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


public class HiruMendiSortu {
       public static void main(String[] args) {
        try {

            Mendia arrate = new Mendia("Arrate","556","Gipuzkoa");
            Mendia Anboto = new Mendia("Anboto", "1331" , "Bizkaia");
            Mendia Oiz = new Mendia("Oiz" , "1029" , "Bizkaia");

            MendiaList mendiaList = new MendiaList();
            mendiaList.add(arrate);
            mendiaList.add(Anboto);
            mendiaList.add(Oiz);

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance(MendiaList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            /* marshaling of java objects in xml (output to file and standard output) */
            jaxbMarshaller.marshal(mendiaList, new File("HiruMendi.xml"));
            jaxbMarshaller.marshal(mendiaList, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

package dambi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonWriter;
import javax.json.Json;
import javax.json.JsonObject;

public class JsonZuhaitzaSortuBi {
    public static void main(String[] args) {

        JsonObject model = Json.createObjectBuilder()
                .add("menu", Json.createObjectBuilder())
                .add("id", "file")
                .add("value", "File")
                .add("popup", Json.createObjectBuilder())
                .add("menuitem", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("value", "New")
                                .add("onclick", "CreateNewDoc()"))
                        .add(Json.createObjectBuilder()
                                .add("value", "Open")
                                .add("onclick", "OpenDoc()"))
                        .add(Json.createObjectBuilder()
                                .add("value", "Close")
                                .add("onclick", "CloseDoc()"))
                                )
                .build();

        try (JsonWriter file = Json.createWriter(new FileWriter("data/Irteera3.json"))) {
            file.write(model);
        } catch (FileNotFoundException ex) {
            System.out.println("Artxiboa ez du aurkitu " + ex.getMessage());
        } catch (IOException ex) {

        }
    }
}

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

public class JsonZuhaitzaSortu {
    public static void main(String[] args) {

        JsonObject model = Json.createObjectBuilder()
                .add("firstName", "Duke")
                .add("lastName", "Java")
                .add("age", 18)
                .add("streetAddress", "100 Internet Dr")
                .add("city", "JavaTown")
                .add("state", "JA")
                .add("postalCode", "12345")
                .add("phoneNumbers", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("type", "mobile")
                                .add("number", "111-111-1111"))
                        .add(Json.createObjectBuilder()
                                .add("type", "home")
                                .add("number", "222-222-2222")))
                .build();

        try (JsonWriter file = Json.createWriter(new FileWriter("data/Irteera2.json"))) {
            file.write(model);
        } catch(FileNotFoundException ex){
            System.out.println("Artxiboa ez du aurkitu " + ex.getMessage());
        } catch(IOException ex){

        }
    }
}
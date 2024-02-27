import org.json.simple.JSONObject;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {

        JSONObject jo = new JSONObject();

        // putting data to JSONObject
        jo.put("firstName", "John");
        jo.put("lastName", "Smith");
        jo.put("age", 25);

        // for address data, first create LinkedHashMap
        Map m = new LinkedHashMap(4);
        m.put("streetAddress", "21 2nd Street");
        m.put("city", "New York");
        m.put("state", "NY");
        m.put("postalCode", 10021);

        // putting address to JSONObject
        jo.put("address", m);

        System.out.println("JSON: " + jo);
        System.out.println("Firstname:" + jo.get("firstName"));
        System.out.println("address: " + jo.get("address"));
    }
}

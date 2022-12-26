import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Anton", "Khliebnikov");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String myName = gson.toJson(person);
        System.out.println(myName);
    }
}

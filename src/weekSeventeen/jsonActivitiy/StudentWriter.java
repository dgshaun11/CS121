package weekSeventeen.jsonActivitiy;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student carInfo = new Student("Shaun",3.9,"Freshman");
            Gson gson = new Gson();
            String jsonString = gson.toJson(carInfo);
            System.out.println(jsonString);
            FileWriter filewriter = new FileWriter("student.json");
            filewriter.write(jsonString);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


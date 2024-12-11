package weekSeventeen.jsonActivitiy;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StudentReaderSingleObject {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader,Student.class);
            System.out.println("****** Student Details ******");
            System.out.printf("Name: %s\nGrade level: %s\nGPA: %f\n",student.getName(),student.getGradeLevel(),student.getGpa());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


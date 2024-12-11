package weekSeventeen.jsonActivitiy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class StudentReader {
    public static void main(String[] args) {
        try {
            Student student = new Student("Shaun", 3.9, "Freshman");
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            Type carListType = new TypeToken<List<Student>>(){}.getType();
            List<Student> studentList = gson.fromJson(reader, carListType);
            System.out.println("****** Car Details ******");
            for(Student car : studentList) {
                System.out.printf("Student name %s\ngrade level: %s\nGPA: %d\n",student.getName(),student.getGradeLevel(),student.getGpa());
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


package weekSeventeen.jsonActivitiy;

public class Student {
    private double gpa;
    private String name;
    private String gradeLevel;
    private static int instanceCount = 0;

    Student(){
        instanceCount++;
    }
    Student(String name, String gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        instanceCount++;
    }
    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    Student(String name, double gpa, String gradeLevel){
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }
    public Student(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showDetails(){
        System.out.println("Name: " + name + " GPA: " + gpa + " Grade Level:" + gradeLevel);
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
}

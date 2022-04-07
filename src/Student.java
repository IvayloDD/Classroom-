import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if(grade >= 2 && grade <= 6) {
            this.grades.add(grade);
        } else {
            System.out.println("The grade is not between 2 and 6");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

}

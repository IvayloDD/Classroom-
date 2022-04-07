import java.util.ArrayList;

public class SubjectClass {
    private ArrayList<Student> students;
    private String nameOfClass;
    private int room;

    public SubjectClass(String nameOfClass, int room) {
        this.nameOfClass = nameOfClass;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void getStudents() {
        int flag = 1;
        System.out.println(getNameOfClass());
        for(Student student : students) {
          System.out.println(flag + "." + student.getName());
          flag++;
      }
    }

    public boolean addStudent(String studentName)
    {
        if(findStudent(studentName) == null) { // findStudent -> hard method
            this.students.add(new Student(studentName));
            return true;
        }
        return false;
    }

    public Student findStudent(String studentName)
    {
        for(int i = 0; i < students.size();i++) {
            if(this.students.get(i).getName().equals(studentName)) {
                return this.students.get(i);
            }
        }
        return null;
    }

    public boolean addGradeToExistingStudent(String studentName, double grade) {
        Student existingStudent = findStudent(studentName);
        if(existingStudent != null) {
            existingStudent.addGrade(grade);
            return true;
        }
        return false;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void printGradesOfStudent(String studentName)
    {
        Student student = findStudent(studentName);
        if(student != null) {
            System.out.println("Grades in " + getNameOfClass() + " of " + studentName + ":");
            System.out.println(student.getGrades());
        } else {
            System.out.println("Student not found");
        }
    }
}

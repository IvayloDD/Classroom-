import java.util.ArrayList;

public class Classroom {
    private String nameOfClassRoom;
    private ArrayList<SubjectClass> listOfClasses;

    public Classroom(String nameOfClassRoom) {
        this.nameOfClassRoom = nameOfClassRoom;
        this.listOfClasses = new ArrayList<>();
    }

    private ArrayList<SubjectClass> getListOfClasses()
    {
        return listOfClasses;
    }

    public void addClasses(SubjectClass subjects) {
        listOfClasses.add(subjects);
    }

    public void printAllGradesOfStudent(String subject, String studentName)
    {
        SubjectClass subjectClass = findClass(subject);
        if(subjectClass != null) {
            subjectClass.printGradesOfStudent(studentName);
        } else {
            System.out.println("This classroom does not teach this subject " + subject);
        }
    }

    private SubjectClass findClass(String subject)
    {
        for(int i = 0; i < listOfClasses.size();i++) {
            if(this.listOfClasses.get(i).getNameOfClass().equals(subject)) {
                return this.listOfClasses.get(i);
            }
        }
        return null;
    }

    public void addGradeToStudent(String subject, String studentName, double grade)
    {
        SubjectClass subjectClass = findClass(subject);
        if(subjectClass != null ) {
            System.out.println("Grade added ");
            subjectClass.addGradeToExistingStudent(studentName,grade);
        } else {
            System.out.println("Not found!!!");
        }
    }

    public void averageStudent(String subject, String studentName) {
        double sum = 0;
        SubjectClass subjectClass = findClass(subject);
        if(subjectClass != null) {
            Student student = subjectClass.findStudent(studentName);
            for(int i = 0; i < student.getGrades().size(); i++) {
                sum += student.getGrades().get(i);
            }
            System.out.println("The average is " + String.format("%.2f", sum/student.getGrades().size()));
        }
    }

    public void printListOfStudents(String subject)
    {
        SubjectClass subjectClass = findClass(subject);
        if(subjectClass != null) {
           subjectClass.getStudents();
        }

    }
}

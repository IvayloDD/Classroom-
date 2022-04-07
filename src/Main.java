import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Classroom classroom = new Classroom("12A");

        SubjectClass biology = new SubjectClass("Biology",5004);
        SubjectClass planning = new SubjectClass("Planning", 2011);
        biology.addStudent("Ivaylo");
//        biology.addGradeToExistingStudent("Ivaylo",4);
//        biology.addGradeToExistingStudent("Ivaylo",5.50);
        biology.printGradesOfStudent("Ivaylo");
        planning.addStudent("Vanko");


        SubjectClass history = new SubjectClass("History", 4003);
        history.addStudent("Ivaylo");
        history.addGradeToExistingStudent("Ivaylo",5);
        history.addGradeToExistingStudent("Ivaylo",4.40);
        history.printGradesOfStudent("Ivaylo");

        SubjectClass math = new SubjectClass("Mathematics", 5008);
        math.addStudent("Ivaylo");
        math.addStudent("Mihaela");
        math.addStudent("Nikolay");
        math.addStudent("Vasil");
//        math.addGradeToExistingStudent("Ivaylo",5.0);
//        math.addGradeToExistingStudent("Ivaylo", 6);
        math.printGradesOfStudent("Ivaylo");
        math.getStudents();

        classroom.addClasses(math);
        classroom.addClasses(history);
        classroom.addClasses(biology);
        classroom.addClasses(planning);

        boolean quit = false;
        printChoices();

        while(!quit) {
            System.out.println("Enter your choice of action: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the application....");
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter the name of the subject:");
                    String subject = scanner.next();
                    System.out.print("Enter the name of the student:");
                    String student = scanner.next();
                    classroom.printAllGradesOfStudent(subject,student);
                    break;
                case 2:
                    System.out.print("Enter the name of the subject:");
                    subject = scanner.next();
                    System.out.print("Enter the name of the student:");
                    student = scanner.next();
                    System.out.print("Enter the grade in " + subject + ": ");
                    double grade = scanner.nextDouble();
                    classroom.addGradeToStudent(subject,student,grade);
                    break;
                case 3:
                    System.out.print("Enter the name of the subject:");
                    subject = scanner.next();
                    System.out.print("Enter the name of the student:");
                    student = scanner.next();
                    classroom.averageStudent(subject, student);
                    break;
                case 4:
                    System.out.print("Enter the name of the subject:");
                    subject = scanner.next();
                    classroom.printListOfStudents(subject);
                    break;
                case 5:
                    printChoices();
                    break;

            }
        }
    }

    private static void printChoices() {
        System.out.println("\nAvailable choices:\npress");
        System.out.println("0 - To quit");
        System.out.println("1 - To print all grades of a student ");
        System.out.println("2 - To add grade to a specific student in a subject");
        System.out.println("3 - To print the average of a student in a subject");
        System.out.println("4 - To Print a list of all students in a specific class");
        System.out.println("5 - To Print Choices");
    }
}

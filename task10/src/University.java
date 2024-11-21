import java.util.ArrayList;
import java.util.List;

public class University {
    static List<Student> students = new ArrayList<>();


    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void sortStudentsByAlphabet() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getName().compareTo(students.get(j+1).getName()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        for(Student student : students) {
            System.out.println(student);
        }
    }

     public static void sortStudentsByGrade() {
         int n = students.size();
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (students.get(j).getGrade() < students.get(j + 1).getGrade()) {
                     Student temp = students.get(j);
                     students.set(j, students.get(j + 1));
                     students.set(j + 1, temp);
                 }
             }
         }
         for(Student student : students) {
             System.out.println(student);
         }
     }

    public static void main(String[] args) {
        Student student1 = new Student("Igor","3p2",3.2);
        Student student2 = new Student("Miron","4R4",5.2);
        Student student3 = new Student("Alena","5R5",6.2);

        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        sortStudentsByAlphabet();
//        sortStudentsByGrade();




    }

}


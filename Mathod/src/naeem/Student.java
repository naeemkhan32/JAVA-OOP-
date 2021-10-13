package naeem;

public class Student {
    String name, section, departmant, university;
    int id, batch;

    void displayInformation(){
        System.out.println("Student name = "+name);
        System.out.println("Student Id = "+id);
        System.out.println("Student Section = "+section);
        System.out.println("Student Batch = "+batch);
        System.out.println("Student Departmant = "+departmant);
        System.out.println("Student University Name = "+university);
    }
}

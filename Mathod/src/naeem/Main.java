package naeem;

public class Main {

    public static void main(String[] args) {

    Student student1 = new Student();
    student1.name = "Naeem Khan";
    student1.id = 2012020105;
    student1.section = "C";
    student1.batch = 53;
    student1.departmant = "Computer Science and Engneering";
    student1.university = "Leading University,Sylhet";

    student1.displayInformation();
        System.out.println("\n");

        Student student2 = new Student();
        student2.name = "hira";
        student2.id = 2012020106;
        student2.section = "C";
        student2.batch = 53;
        student2.departmant = "Computer Science and Engneering";
        student2.university = "Leading University,Sylhet";
        student2.displayInformation();


    }
}

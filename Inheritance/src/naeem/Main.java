package naeem;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        Person p1 = new Person();
        t1.name = "Anisul";
        t1.id = 201200;
        t1.departmant = "CSE";

        p1.name = "nk";
        p1.id = 2012;

        t1.disply2();
        System.out.println();
        p1.disply1();
        System.out.println("the number of value");
    }
}

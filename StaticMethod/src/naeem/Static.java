package naeem;

public class Static {
    static String name;
    static int id;


    static {
        name = "Naeem Khan";
        id = 105;

    }

    static void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
    }

    public static void main(String[] args) {
        Static.display();
    }
}

package naeem;

public class StaticBlock {
    static int id;
    static String name;

    static{
        id = 2012020105;
        name = "Naeem";
    }

    static void disply(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}





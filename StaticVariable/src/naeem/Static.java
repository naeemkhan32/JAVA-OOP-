package naeem;

public class Static {
    String name;
    int id, batch = 53;
   static String universityName = "LU";




    Static(String n, int i){
        name = n;
        id = i;
    }

    void disply(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println("Batch = "+batch);
    }
}

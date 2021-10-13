package naeem;

public class Student {
    String name,gender;
    int phone;

    void setinput(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }

    void displayINformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phonr : "+phone);
    }

}

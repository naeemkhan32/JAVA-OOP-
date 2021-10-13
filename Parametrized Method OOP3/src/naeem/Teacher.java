package naeem;

public class Teacher {
    String name,gender;
    int phone;

    void setinput(String n,String m,int ph){
        name = n;
        gender = m;
        phone = ph;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Number : "+phone);
    }

}

package naeem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher1 = new Teacher();\
        teacher1.setinput("Naeem Khan","male",75468);
        teacher1.display();

        System.out.println(" ");
        Teacher teacher2 = new Teacher();
        teacher2.setinput("hira","male",75008);
        teacher2.display();

        System.out.println(" ");
        Teacher teacher3 = new Teacher();
        teacher3.setinput("hridoy","male",75468);
        teacher3.display();


    }
}

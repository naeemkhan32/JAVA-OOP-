package naeem;

public class Main {

    public static void main(String[] args) {
/*

        EncapTest ob = new EncapTest();
        ob.name = "Naeem Khan";
        ob.id = 2012020105;
        ob.disply();
*/

        EncapTest p1 = new EncapTest();
        p1.setName("Naeem Khan");
        System.out.println(p1.getName());

        EncapTest p2 = new EncapTest();
        p2.setAge(21);
        System.out.println(p2.getAge());



    }
}

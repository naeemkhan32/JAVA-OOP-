package naeem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EBL ebl = new EBL();
        SEBL sebl = new SEBL();
        System.out.println("rate : "+ebl.rateOfInterst());
        System.out.println("rate : "+sebl.rateOfInterst());
    }
}

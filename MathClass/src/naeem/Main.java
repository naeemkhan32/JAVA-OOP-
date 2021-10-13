package naeem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 40;
        int y = 50;
        int z = -60;
        double n = 2, k = 3;

        int max = Math.max(x,y);
        System.out.println("The Maxmum number = "+max);
        //System.out.println( Math.max(x,y));
        int absolute = Math.abs(z);
        System.out.println("Absolut value = "+absolute);

        double power = Math.pow(n,k);
        System.out.println("the power = "+power);
    }
}

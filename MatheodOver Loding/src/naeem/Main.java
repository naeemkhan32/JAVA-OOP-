package naeem;

public class Main {
    int add(int a, int b)
    {
        int result = a+b;
        return result;
    }

    /*
    int add(int a, int b, int c)
    {
        int result = a+b+c;
        return result;
    }
     */

    double add(double a, double b, double c)
    {
        double result = a+b+c;
        return result;
    }


    public static void main(String[] args) {
	// write your code here

        Main main = new Main();
        System.out.println("ans:"+main.add(3.5,2.9, 6));
    }
}

import java.util.Scanner;


class Main {
    
    private double r;
    private double c;
    
    public void getCirc (double circ){
    double getCirc = 3.14 * (2 * r);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the Radius: ");
        double r1 = sc.nextDouble();
        double getCirc = 3.14 * (2 * r1);
        System.out.println ("The Circumference is:");
        System.out.println ("2 * " + r1 + " * 3.14 = " + getCirc);
    }
}
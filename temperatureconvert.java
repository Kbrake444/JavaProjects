import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double fahrenheit = 0;
        
        double celsius = 0;
        
        double kelvin = 0;
        
        System.out.println("Input the amount of degrees celsius: ");
        
        celsius = sc.nextDouble();
        
        fahrenheit = Temperature.getFahrenheit(celsius);
        
        kelvin = Temperature.getKelvin(celsius);
        
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit, and " + kelvin + " degrees Kelvin.");
        
        
    }
}
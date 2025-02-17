import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = 0; // sum
	    int t1 = 0; // first number
	    int t2 = 1; // second number
	    int n = sc.nextInt(); // how many times to add
	 
	    
	    for(int i = 0; i <= n; i++){
	        t = t1 + t2; // sum
	        System.out.println(t);
	        t1 = t2;
	        t2 = t;
	    }
	}
}


import java.util.*; 

public class Exceptionn {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=1;
		do {
			
		
		try {
		System.out.println("Enter first number");
		int n1= input.nextInt();
		
		System.out.println("Enter second number");
		int n2= input.nextInt();
		int sum= n1/n2;
		System.out.println(sum);
		x=2;
		}
		catch(Exception e) {
			System.out.println("Enter valid number");
		}
		}while(x==1);
		
	}

}


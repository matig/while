import java.util.Scanner;


public class while1 {
	
	public static void main (String[] ar) {
		
	Scanner boton =new Scanner(System.in);

	float n;
	
	System.out.print("Ingrese un numero menos a 100");
	
	n=boton.nextFloat();
	
	while (n<=100) {
		
		System.out.print(n);
		System.out.print(" ");
		
		n=++n;
		n=++n;
	}
	
	
	}

}

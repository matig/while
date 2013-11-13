import java.util.Scanner;


public class promedioWhile {

	public static void main(String[] ar) {
		
		int total,control;
		float n,promedio,suma;

Scanner teclado= new Scanner(System.in);

suma=0;
control=0;
total=0;


while (control <10) {

	
System.out.println("ingrese un valor ");

n=teclado.nextFloat();
control=++control;		
suma=suma+n;

total=++total;

}		

promedio=suma/total;
System.out.println("la suma de los valores que ha ingresado es");
System.out.println(suma);
System.out.println("el promedio es igual a ");
System.out.println(promedio);
System.out.print(control);

	}
}

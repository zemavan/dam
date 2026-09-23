import java.util.Scanner;
class Input {
	public static void main(String[] arguments) 
	{
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Nombre: ");
	String nombre = sc.nextLine();

	System.out.println("Hola " + nombre);
	sc.close();
	}
}

import java.util.Random;
import java.util.Scanner;

class EjerClass1{
	public static void main(String[] arguments)
	{
	// Dado un numero mostrar la tabla de multiplicar  ()


	Scanner sc = new Scanner(System.in);
	System.out.println("Num: ");
	int num = sc.nextInt();
	System.out.println("");
	for(int i = 1; i <= num; i++)
	{
	    int total = num * i;
	    System.out.println(total);
	}
	}
}

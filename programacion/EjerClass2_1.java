import java.util.Random;
import java.util.Scanner;

class EjerClass2{
	public static void main(String[] arguments)
	{
	//Dado un numero  N  mostrar los  N  primeros numeros de la serie Fibonacci  (0,1,1,2,3,5,8,13,21)     por ejemplo que
	// результат следуйщего числа равен сумме двух предидущих чисел.


	Scanner sc = new Scanner(System.in);
	System.out.print("Longitud: ");
	int longitud = sc.nextInt();

	int first = 0;
	int second = 1;

	System.out.print(first);
	System.out.print(second);

	for(int i = 0; i<=longitud; i++)
	{
	    // System.out.print(first);
		// System.out.print(second);

		int next = first + second;

		// System.out.print(next);

		first = second;
		second = next;
		next = first + second;
		System.out.print(next);

	}

	}
}

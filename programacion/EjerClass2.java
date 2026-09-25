import java.util.Random;
import java.util.Scanner;

class EjerClass2{
	public static void main(String[] arguments)
	{
	//Dado un numero  N  mostrar los  N  primeros numeros de la serie Fibonacci  (1,1,2,3,5,8,13,21)     por ejemplo que


	Scanner sc = new Scanner(System.in);
	System.out.print("Longitud: ");
	int longitud = sc.nextInt();

	int total = 0;
	for(int i = 1; i < longitud; i ++)
	{
		System.out.print(i);
	}
	for (int j = 0; j < longitud; j ++)
	{
	    System.out.print(j);
	}

	}

	}

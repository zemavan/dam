import java.util.Scanner;
class Tablero {
	public static void main(String[] arguments) 
	{
		
	Scanner sc = new Scanner(System.in);

	System.out.println("fila: ");
	int fila = sc.nextInt();

	System.out.println("columna: ");
	int columna = sc.nextInt();
	sc.close();

	int [][] tablero = new int [fila][columna];

	for (int i = 0; i < fila; i++)
	{
		for (int j = 0; j < columna; j++)
		{
			tablero[i][j] = 0;
			System.out.print(tablero[i][j] + " ");

		}
		System.out.println("");
	}

	sc.close();
	}
}
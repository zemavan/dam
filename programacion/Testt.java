import java.util.Scanner; 
import java.util.Random;
class Testt {
	public static void main(String[] arguments) 
	{
	
	int numMin = 1;
	int numMax = 100;

	Random random = new Random();


	Scanner sc = new Scanner(System.in);

	System.out.println("fila: ");
	int fila = sc.nextInt();

	System.out.println("columna: ");
	int columna = sc.nextInt();
	sc.close();

	int [][] tablero = new int [fila][columna];

	int filaBomba = random.nextInt(0, fila -1); // i
	int columnaBomba = random.nextInt(0, columna -1); // j 

	for (int i = 0; i < fila; i++)
	{
		for (int j = 0; j < columna; j++)
		{
			int Bomba [filaBomba][columnaBomba]
			tablero[i][j] = random.nextInt(numMin, numMax);
			System.out.print(tablero[i][j] + " ");

		}
		System.out.println("");
	}

	sc.close();
	}
}
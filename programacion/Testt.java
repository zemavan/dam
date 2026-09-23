import java.util.Scanner;
import java.util.Random;
class Testt {
	public static void main(String[] arguments)
	{

	int numMin = 1;
	int numMax = 100;

	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	System.out.println("row: ");
	int row = sc.nextInt();

	System.out.println("column: ");
	int column = sc.nextInt();
	sc.close();

	int [][] table = new int [row][column];

	int rowBomb = random.nextInt(0, row -1); // i
	int columnBomb = random.nextInt(0, column -1); // j

	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < column; j++)
		{
			int Bomb [rowBomb][columnBomb]
			table[i][j] = random.nextInt(numMin, numMax);
			System.out.print(table[i][j] + " ");

		}
		System.out.println("");
	}

	sc.close();
	}
}

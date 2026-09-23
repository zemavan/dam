import java.util.Scanner;
class Testt {
	public static void main(String[] arguments)
	{


	Scanner sc = new Scanner(System.in);

	System.out.println("row: ");
	int row = sc.nextInt();

	System.out.println("column: ");
	int column = sc.nextInt();
	sc.close();

	int [][] table = new int [row][column];

	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < column; j++)
		{

			System.out.print(table[i][j] + " ");


		}
		System.out.println("");

	}
	}
}

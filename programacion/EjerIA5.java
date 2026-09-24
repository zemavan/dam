import java.util.Random;
import java.util.Scanner;
class EjerIA5 {
	public static void main(String[] arguments)
	{

	// Задача 5 — заполнить поле
	//
	// Создай поле 5 × 5.
	//
	// Заполни его случайными числами 0 или 1.
	//
	// Например:
	//
	// 0 1 0 0 1
	// 1 0 0 1 0
	// 0 0 1 0 0
	// 0 1 0 0 1
	// 1 0 0 1 0
	//
	// Это уже очень близко к минам.

	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	System.out.println("Rows: ");
	int row = sc.nextInt();

	System.out.println("Columns: ");
	int col = sc.nextInt();

	int [][] grid = new int [row][col];

	for(int i = 0; i<row; i++)
	{
	    for(int j = 0; j < col; j++)
	{
	    grid[i][j] = ran.nextInt(2);
		System.out.print(grid[i][j] + " ");
	}
	System.out.println("");
	}

    }

}

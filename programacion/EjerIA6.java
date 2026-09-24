import java.util.Scanner;
import java.util.Random;
class EjerIA6 {
	public static void main(String[] arguments)
	{
	// Задача 6 — поставить одну мину
	//
	// Создай поле:
	//
	// 5 × 5
	//
	// Сгенерируй случайные координаты:
	//
	// int mineI = ...
	// int mineJ = ...
	//
	// И поставь:
	//
	// table[mineI][mineJ] = 1;
	//
	// Выведи поле.
	//
	// Проблема: попробуй сделать так, чтобы мина не появлялась за пределами массива.

	Random rand = new Random();

	int[][] grid = new int[5][5];

	int mineI = rand.nextInt(5);
	int mineJ = rand.nextInt(5);

	grid[mineI][mineJ] = 1;

	for(int i = 0; i<5; i++)
	{
	    for(int j = 0; j<5; j++)
		{
		    System.out.print(grid[i][j] + " ");
		}
		System.out.println("");
	}

	}
}

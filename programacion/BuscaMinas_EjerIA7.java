import java.util.Scanner;
import java.util.Random;
class BuscaMinas_EjerIA7 {
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
	//
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);


	int[][] gride = new int [5][5];
	int mineI = rand.nextInt(5);
	int mineJ = rand.nextInt(5);

	gride[mineI][mineJ] = 1;

	System.out.print("i: ");
	int inputI = sc.nextInt();

	System.out.print("j: ");
	int inputJ = sc.nextInt();

	for(int i = 0; i<5; i++)
	{
	    for(int j = 0; j<5; j++)
					{
					System.out.print(gride[i][j] + " ");

					}
				System.out.println("");

	}
	if(inputI == mineI && inputJ == mineJ) // if(grid[inputJ][inputI] == 1)
	{
	    System.out.print("BOOM!");
	}
	else
	{
	    System.out.print("SAFE!");
	}

	// Уровень 3 — координаты
	// Задача 7 — пользователь выбирает клетку
	//
	// Создай поле 5 × 5.
	//
	// Попроси:
	//
	// Enter i:
	// Enter j:
	//
	// Например:
	//
	// Enter i: 2
	// Enter j: 4
	//
	// И выведи значение:
	//
	// table[i][j]
	//
	// Если там 1:
	//
	// BOOM!
	//
	// Если 0:
	//
	// Safe!



	}
}

import java.util.Random;
import java.util.Scanner;
class EjerIA4 {
	public static void main(String[] arguments)
	{
//
// 	Задача 4 — создать поле

// 	Попроси пользователя:
//
// 	row: 3
// 	column: 5
//
// 	Создай:
//
// 	int[][] table = new int[row][column];
//
// 	И выведи:
//
// 	0 0 0 0 0
// 	0 0 0 0 0
// 	0 0 0 0 0
//
// 	Главная цель: понять два for.

    Scanner sc =  new Scanner(System.in);
    System.out.println("Rows: ");
    int rowsNum = sc.nextInt();

    System.out.println("Columns: ");
    int columnsNum = sc.nextInt();

    int[][] grid = new int[rowsNum][columnsNum];

    for(int i = 0; i < grid.length; i ++)
    {
        for(int j = 0; j < grid.length; j ++)
        {
            System.out.print(grid[i][j] + " ");
        }
        System.out.println("");
    }

	}
}

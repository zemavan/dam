import java.util.Random;
import java.util.Scanner;
class DoubleVectorRandint {
	public static void main(String[] arguments)
	{

	int bombValue = 1;
	Random random = new Random();

	Scanner sc = new Scanner(System.in);
	System.out.println("rows: ");
	int inputRows = sc.nextInt();

	System.out.println("columns: ");
	int inputColumns = sc.nextInt();


	int [][] grid = new int [inputRows][inputColumns];
	int rowRandPosition = random.nextInt(inputRows);
	int columnsRandPosition = random.nextInt(inputColumns);
	grid[rowRandPosition][columnsRandPosition] = bombValue;

	for(int i = 0; i<inputRows; i++)
	{
	    for(int j = 0; j<inputColumns; j++)
					{
					System.out.print(grid[i][j] + " ");
					}
					System.out.println("");




		//сетка с бомбой = чистой клетке[рандомСтрока][рандомСтолбик]
		// сетка с бомбой [рандомСтрока][РандомCтоблик] по таким координатам ровна 1;

	}



// 	int [][] table = {{0,0},{0,0}};
//
// 	int rowRandPos = random.nextInt(2);
// 	int columnRandPos = random.nextInt(2);
//
// 	table[rowRandPos][columnRandPos] = bombValue;
//
//         for (int i = 0; i < table.length; i++) {
//             for (int j = 0; j < table[i].length; j++) {
//                 System.out.print(table[i][j] + " ");
// 		}
// 	System.out.println("");
// 	}
//
	}
}

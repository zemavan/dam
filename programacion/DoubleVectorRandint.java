import java.util.Random;
class DoubleVectorRandint {
	public static void main(String[] arguments)
	{

	int bombValue = 1;
	Random random = new Random();

	int [][] table = {{0,0},{0,0}};

	int rowRandPos = random.nextInt(2);
	int columnRandPos = random.nextInt(2);

	table[rowRandPos][columnRandPos] = bombValue;

	System.out.println("--- Ваше поле с бомбой ---");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
		}
	System.out.println("");
	}

	}
}

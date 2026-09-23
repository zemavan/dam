import java.util.Random;
class Testt {
	public static void main(String[] arguments)
	{

	Random random = new Random();

	int bomb = 1;

	int[] numbers = {0,0,0,0,0,};
	int bombPos = random.nextInt(numbers.length);
	numbers[bombPos] = bomb;


	for(int i = 0; i < numbers.length; i++){
	    System.out.println(numbers[i]);
	}

	}
}

import java.util.Random;
class EjerIA3 {
	public static void main(String[] arguments)
	{
	// Задача 3 — случайные числа
	//
	// Создай массив из 10 int.
	//
	// Заполни его случайными числами от 1 до 9.
	//
	// Получиться может:
	//
	// 4 8 2 1 9 3 3 7 5 1

	Random random = new Random();

	int [] nums = new int [10];
	for(int i = 0; i < nums.length; i++)
	{
	    int randomNumbers = random.nextInt(10);
	    nums[i] = randomNumbers;
		System.out.print(nums[i] + " ");
	}
	}
}

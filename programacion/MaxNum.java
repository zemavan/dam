class MaxNum {
	public static void main(String[] arguments)
	{
	// Задача 1 — найти максимальное
	//
	// Создай:
	//
	// int[] numbers = {4, 8, 2, 15, 3};
	//
	// Выведи самое большое число.

	// Тренируешь: for, массивы, if.

	int[] numbers = {4, 8, 2, 15, 3};
	int max = 0;

	for(int i = 0; i<numbers.length; i++)
	{
	    if(numbers[i] > max)
		{
		    max = numbers[i];
		}

	}
	System.out.println(max);
	}
}

class EjerIA2 {
	public static void main(String[] arguments)
	{
	// Задача 2 — заменить элементы
	//
	// Создай:
	//
	// int[] numbers = {0, 0, 0, 0, 0};
	//
	// С помощью for сделай:
	//
	// 1 2 3 4 5
	//
	// Условие: нельзя писать пять присваиваний вручную.

	int [] numbers = {0,0,0,0,0};
	int numForList = 0;
	for(int i = 0; i<numbers.length; i++)
	{
		numForList ++;
	    numbers[i] = numForList;
		System.out.println(numbers[i]);
	}

	}
}

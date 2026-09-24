class DoWhile {
	public static void main(String[] arguments)
	{
	    int i = 10;
		boolean control = true;

		do
		{
		if (i == 7 || i == 10)
		{
		    System.out.println("Numero i es igual a 10 ==  " + i);
			control = false;
		}
		 else if(i % 2 == 0)
		{
    		System.out.println("  es par  " + i);
		}
		else
		{
		     System.out.println("numero is impar: " + i);
		}
		i++;
		} while (i<5);


	}
}

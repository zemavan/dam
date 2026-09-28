import java.util.Random;
import java.util.Scanner;
class EjerIA4 {
	public static void main(String[] arguments)
	{
    Scanner sc = new Scanner(System.in);

	System.out.print("Print num: ");
	int num = sc.nextInt();
	int counter = 0;
	for(int i = 1; i<=num; i++)
	{
	    if (i % 2 == 0)
		{
		   counter ++;
		}

	}

	System.out.println(counter);
	}
}

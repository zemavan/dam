import java.util.Random;
import java.util.Scanner;
class javMeth  {


    public static int suma(int first, int second){
    return first + second;
    }

	public static void main(String[] arguments)
	{

	Scanner sc = new Scanner(System.in);
	System.out.print("First num: ");
	int firstnum = sc.nextInt();

	int total = suma(firstnum, 100);
	System.out.println(total);


	}
	}

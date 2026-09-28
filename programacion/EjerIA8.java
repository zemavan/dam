import java.util.Random;
import java.util.Scanner;
class EjerIA4 {
	public static void main(String[] arguments)
	{

	int password = 1234;
	Scanner sc = new Scanner(System.in);
	int t = 0;
	int ok = 0;

	do
	{
	    System.out.println("password: ");
		int upass = sc.nextInt();
		if(upass!=password)
		{
		    System.out.println("wrong");
			t ++;
		}
		if(upass==password)
		{
		    System.out.println("access granted");
			ok = 1;
		}

	}

	while(ok == 0);

}
	}

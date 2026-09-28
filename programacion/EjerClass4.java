import java.util.Random;
import java.util.Scanner;
// Genera un numero aleatorio entre 0 y 100 y cuenta los intentos hasta adivinarlo

class EjerClass4{
	public static void main(String[] arguments)
	{

	Random random = new Random();
	Scanner sc = new Scanner(System.in);

        // System.out.print("Intorduce num from 0 to 100: ");
    	int rand = random.nextInt(10);
        int start = 1;
        int counter = -1;

    do
    {

    System.out.print("Intorduce num from 0 to 10: ");
   	int userNum = sc.nextInt();

    	if(userNum!=rand)
    	{
    	    System.out.println("Try again");
        }

        if(userNum == rand)
        {

            System.out.println("");
            System.out.println("Nice one");
    		start = 0;
    	}
     counter++;
    }
    while(start == 1);

System.out.println("missed: " + counter + " times");

	}
}

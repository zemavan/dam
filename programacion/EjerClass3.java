import java.util.Random;
import java.util.Scanner;

class EjerClass3{
	public static void main(String[] arguments)
	{
	// Dado un numero   N  mostrar arbol de  N  lineas
	//          #
	//          ##
	//          ###

	Scanner sc = new Scanner(System.in);
	System.out.print("Num of rows: ");
	int num = sc.nextInt();

	String toShow = "#";

	for(int i = 0; i<=num; i++)
	{

    	System.out.println(toShow);
    	toShow = toShow + "#" ;

	}

	}
}

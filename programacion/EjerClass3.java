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
	System.out.print("Num: ");
	int num = sc.nextInt();
	int times = 0;

	for(int i = 0; i <= num; i++)
	{
	    String outt = "#";
	    System.out.println(outt[i]);
	}
	}
}

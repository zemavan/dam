import java.util.Random;
import java.util.Scanner;
class calcMeth  {


    public static int suma(int first, int second){
        return first + second;
    }
    public static int resta(int first, int second){
        return first - second;
    }
    public static float div(int first, int second){

        float resultado = (float) first / (float) second;
        return resultado;
    }
    public static int mult(int first, int second){
        return first * second;
    }
    public static int menu(int option, int first, int second){
        switch(option){
            case 1:
            return suma(first, second);
       }
    }
	public static void main(String[] arguments)
	{



	Scanner sc = new Scanner(System.in);
	System.out.print("First num: ");
	int firstnum = sc.nextInt();

	float total = div(firstnum, 3);

	System.out.println(firstnum + " " + total);


	}
	}


import java.util.Random;
import java.util.Scanner;
class javMeth  {

    public static float suma(float a, float b){
        float res = a + b;
        return res;
    }

    public static int rest(int a, int b){
        int res = a - b;
        return res;
    }
    public static int mult(int a, int b){
        int res = a * b;
        return res;
    }
    public static float dev(int a, int b){
        float res = (float)a /  (float)b;
        return res;
    }



	public static void main(String[] arguments)
	{
	    Scanner sc = new Scanner(System.in);

		System.out.print("Choose operation mode: 1 = +; 2 = -; 3 = *; 4 = /    :");
        int operation = sc.nextInt();

		System.out.println("first num: ");
		float firstNum = sc.nextFloat();

		System.out.println("first second: ");
        float secondNum = sc.nextFloat();



	    switch(operation){
			case 1:
		float sum = suma(firstNum, secondNum);
		System.out.println("The result is: " + sum);
		break;
		//     case 2:
		// int resta = rest(firstNum, secondNum);
		// System.out.println("the result is: " + resta);
		// break;
		//     case 3:
		// System.out.println(mult(firstNum, secondNum));
		// break;
  //           case 4:
  //       System.out.println(dev(firstNum, secondNum));
  //       break;
		}
	}
	}

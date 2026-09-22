public class Ejerc{
	public static void main (String[] args)
	{


        int nota = 0;

        if (nota <= 0 || nota >= 10)
        {
            System.out.println("Aprove");
        } 
        else if (nota >= 5 && nota < 7)
        {
            System.out.println("Nice");
        } 
        else if (nota >= 7 && nota < 9)
        {
            System.out.println("Very good");
        } 
        else 
        {
            System.out.println("Perfect");
        }
    }
}
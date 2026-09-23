public class Forfor {
	public static void main(String[] arguments) 
	{
		int[][] newmat = {{0,0,0},{0,0,0},{0,0,0}};
		int[][] mat = {{4,7,8},{4,6,8},{9,2,3}};

		for (int i = 0; i < 3; i++)
		{
			System.out.println("=====");
			for (int j = 0; j < 3; j++)
			{
				
				//System.out.print(mat[i][j] + "|");
				newmat[i][j] = mat[i][j] / 2;
				System.out.print(newmat[i][j]);
			}

			System.out.println("");
		}

	}
    
}

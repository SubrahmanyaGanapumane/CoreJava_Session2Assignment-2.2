
public class Assignment2_2 {
	public static void main(String args[])
	{

		int x=1, y=9;
		for(int i=0; i<5;i++)
		{
			for(int j=1;j<10;j++ )
			{
				if(j==x)
				{
					System.out.printf("*");
					continue;
				}
				if(j==y)
				{
					System.out.printf("*");
					continue;
				}
	
				
					System.out.print("_");
				
			}
			x+=2;
			y-=2;
			System.out.println("");
			
		}
	}

}

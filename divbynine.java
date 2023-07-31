// divisible by 9
import java.util.*;

class divbynine
{
	public static void main(String args[])
	{
		int i,a;
		Scanner obj = new Scanner(System.in);
		for(i=100;i<=900;i++)
		{
			if(i%9==0)
			{
				System.out.print(i+",\t");
			}
		}
 
	}
}

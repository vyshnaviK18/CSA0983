// first last significance of a num
import java.util.*;

class fls
{
	public static void main(String args[])
	{
		int num,temp=0,rem=0,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Num=");  
		num=obj.nextInt();
		temp=num%10;
		while(num != 0)   
		{  
			rem = num % 10;   
			num= num/10;  
		} 
		System.out.println("Last significance=" +temp);  
		System.out.println("First significance=" +rem);  
	}
}

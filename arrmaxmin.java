// array operations
import java.util.*;

class arrmaxmin
{
	public static void main(String args[])
	{
		int i,a,n,j,m,nm;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size=");
		n=obj.nextInt();
		int s[] = new int[n];
		for ( i=0;i<n;i++)
		{
			System.out.println("Enter Element "+(i+1)+" =");
			s[i]= obj.nextInt();
		}
		//sorting
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i]>s[j])
				{
					a=s[i];
					s[i]=s[j];
					s[j]=a;
				}
			}
		}
		System.out.println("mth maximum=");
		m=obj.nextInt();
		System.out.println("mth maximum in array"+s[(n-m)]);
		System.out.println("nth minimum=");
		nm=obj.nextInt();
		System.out.println("nth minimum in array "+s[(nm-1)]);
		System.out.println("Sum="+(s[(n-m)]+s[(nm-1)]));
		System.out.println("Difference="+(s[(n-m)]-s[(nm-1)]));

	}
}

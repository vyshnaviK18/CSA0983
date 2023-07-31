import java.util.*;

class grade
{
public static void main(String args[])
{
	int reg,i,n=5,sum=0,avg=0;
	String name;
	int ar[]=new int[n];
	Scanner obj= new Scanner(System.in);
	System.out.println("ENTER NAME:");
	name=obj.nextLine();
	System.out.println("ENTER REGISTER NO:");
	reg=obj.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.println("ENTER MARK:"+(i+1));
		ar[i]=obj.nextInt();
	}
	for(i=0;i<n;i++)
	{
		if(ar[i]>50)
		{
			sum=sum+ar[i];
		}
		else{
			System.out.println("FAILED in a subject");
			break;
		}
	}
	avg=sum/5;
	System.out.println("AVG="+avg);
	if(ar[i]>90){
		System.out.println("GRADE S");
		
	}
	else if(ar[i]>80 && ar[i]<=90){
			System.out.println("GRADE A");
	}
	else if(ar[i]>70 && ar[i]<=80){
			System.out.println("GRADE B");
	}
	else if(ar[i]>60 && ar[i]<=70){
			System.out.println("GRADE C");
	}
	else if(ar[i]>50 && ar[i]<=60){
			System.out.println("GRADE D");
	}
	else{
		System.out.println("GRADE F");
	}
}
}

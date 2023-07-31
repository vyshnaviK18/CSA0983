//smallest of three numbers
import java.util.*;

class small
{
	int x,y,z;
	void sm()

	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter three numbers=");
		x= obj.nextInt();
		y= obj.nextInt();
		z= obj.nextInt();
		if(x<y && x<z){
			System.out.println(x);
		}
		else if(y<x && y<z){
			System.out.println(y);
		}
		else{
			System.out.println(z);
		}
	};
}

class num
{
	public static void main(String args[]){
		small i=new small();
		i.sm();
	}
}

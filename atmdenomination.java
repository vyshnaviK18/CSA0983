import java.util.*;

class atmdenomination{
	public static void main(String args[]){
		int a,b,c,d,w,x,y,z,total=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter denomination:");
		w=obj.nextInt();
		System.out.println("Enter number of notes :");
		a=obj.nextInt();
		System.out.println("Enter denomination:");
		x=obj.nextInt();
		System.out.println("Enter number of notes:");
		b=obj.nextInt();
		System.out.println("Enter denomination:");
		y=obj.nextInt();
		System.out.println("Enter number of notes:");
		c=obj.nextInt();
		System.out.println("Enter denomination:");
		z=obj.nextInt();
		System.out.println("Enter number of notes:");
		d=obj.nextInt();
		if( w==2000 && x==500 && y==200 && z==100){
			total=w*a+x*b+y*c+z*d;
			System.out.println("Total amount="+ total); 
		}
		else{
			System.out.println("Invalid Denomination entered!!");
		}

	}
}
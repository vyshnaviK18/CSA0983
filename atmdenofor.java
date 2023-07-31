import java.util.*;

class atmdenofor{
	public static void main(String args[]){
		int a,b,n,total=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of denomination:");
		n=obj.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter denomination:");
			a=obj.nextInt();
			System.out.println("Enter number of notes:");
			b=obj.nextInt();
			if( a==2000 || a==500 || a==200 || a==100){
				total+=a*b;
			}
			else{
				System.out.println("Invalid Denomination entered!!");
			}
		}
		System.out.println("Total amount="+ total); 

	}
}
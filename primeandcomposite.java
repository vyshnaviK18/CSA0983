import java.util.*;

class primeandcomposite{
	public static void main(String args[]){
		int i,n,j,c=0,pc=0,cc=0,z;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter limits=");
		n=obj.nextInt();
		int arr[]= new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter element "+(i+1)+"=");
			arr[i]=obj.nextInt();
		}
		for(i=0;i<n;i++){
			z=arr[i];
			for(j=2;j<=z/2;j++){
				if(z%j==0){
					c++;
				}
			}
			if(c>=1){
				cc++;
			}
			else{
				pc++;
			}
		}
		System.out.println("Number of prime numbers="+pc);
		System.out.println("Number of composite numbers="+cc);
	}
}

					
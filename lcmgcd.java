import java.util.*;

class lcmgcd 
{
	public static void main(String[] args) {
	int j,n;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter size=");
	n=obj.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter Elements:");
	for ( j=0;j<n;j++)
	{
		arr[j]= obj.nextInt();
	}
        	int gcd = arr[0];
        	int lcm = arr[0];
       	for (int i = 1; i < n; i++) 
	{
            		int a = gcd;
            		int b = arr[i];
           		while (b != 0) 
		{
			int temp = b;
                			b = a % b;
                			a = temp;
            		}
            	gcd = a;
            	lcm = (lcm * arr[i]) / gcd;
       	}
        System.out.println("GCD of the given numbers is: " + gcd);
        System.out.println("LCM of the given numbers is: " + lcm);
    }
}

import java.util.*;

class matrixop
{
	public static void main(String args[])
	{
		int m1[][]=new int[20][20];
		int m2[][]=new int[20][20];
		int re[][]=new int[20][20];
		int i,j,ch,n=3,sum=0,k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter matrix one values:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(i+""+j+"  ");
				m1[i][j]=obj.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter matrix two values:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(i+""+j+"  ");
				m2[i][j]=obj.nextInt();
			}
			System.out.println();
		}

		System.out.println("Operations\n1-Addtion\n2-Subtraction\n3-Multiplication\n4-Transpose\n5-sum of diagonals");
		ch= obj.nextInt();
		switch(ch){
			case 1:

				System.out.println("Addtion");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						re[i][j]=m1[i][j]+m2[i][j];
					}
				}
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						System.out.print(re[i][j]+" ");
					}
					System.out.println();
				}
				break;
	
			case 2:

				System.out.println("Subtraction");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						re[i][j]=m1[i][j]-m2[i][j];
					}
				}
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						System.out.print(re[i][j]+" ");
					}
					System.out.println();
				}
				break;
			case 3:

				System.out.println("Multiplication");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						re[i][j]=0;
						for(k=0;k<n;k++){
						re[i][j]+=m1[i][k]*m2[k][j];
						}
					}
				}
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						System.out.print(re[i][j]+" ");
					}
					System.out.println();
				}
				break;
			case 4:

				System.out.println("Transpose of matrix 1");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						System.out.print(m1[j][i]+ " ");
					}
					System.out.println();
				}
				System.out.println("Transpose of matrix 2");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						System.out.print(m2[j][i]+" ");
					}
					System.out.println();
				}
				break;
			case 5 :

				System.out.println("Sum of diagonals");
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						if(i==j){
							sum+=m1[i][j];
						}
					}
				}
				System.out.println("Sum of diagonalsof matrix 1="+sum);
				break;
		}
	}
}
						
	
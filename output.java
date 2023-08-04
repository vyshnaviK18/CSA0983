import java.util.*;

class output{
	public static void main(String args[]){
		String ans="jamesgosling";
		String gn;
		int i=3;
		Scanner obj= new Scanner(System.in);
		while(i>0){
			System.out.println("Who is the inventor of java?");
			gn=obj.next();
			if(gn.equals(ans)){
				System.out.println("Good");
				break;
			}
			else{
				i--;
				System.out.println("Try again");
			}
		}
		if(i==0){
			System.out.println("Wrong answer"+"correct answer= james gosling");
		}

	}
} 
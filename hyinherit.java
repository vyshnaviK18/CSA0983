import java.util.*;
class a{
	int z=10;
	public void display(){
		System.out.println(z+"\tsuper parent of B");
	}
}
class b extends a{
	int x=5;
	public void display1(){
		System.out.println(x+"\tsuper parent of C");
	}
}
interface d{
	int y=0;
	public void display2();	
}
class c extends b implements d{
	public void display2(){
		System.out.println(y+"\tsuper parent(interface) of C");
	}
}
class hyinherit
{
	public static void main(String args[])
	{
		c g= new c();
		g.display2();
		g.display1();
		g.display();
	}
}
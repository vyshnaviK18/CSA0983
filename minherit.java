import java.util.*;
class pp{
	int x=10;
	public void display(){
		System.out.println(x);
	}
}
interface cc {
	public void display1();
}
class gg extends pp implements cc {

	public void display1(){
		System.out.println("interface");
	}
}
class minherit 
{
	public static void main(String args[])
	{
		gg g= new gg();
		g.display1();
		g.display();
	}
}
import java.util.*;
//to check two super class as interface 
interface pp{
	int x=10;
	public void display();
}
interface cc {
	public void display1();
}
class gg implements pp,cc {

	public void display1(){
		System.out.println("interface");
	}
	public void display(){
		System.out.println(x);
	}
}
class interinherit 
{
	public static void main(String args[])
	{
		gg g= new gg();
		g.display1();
		g.display();
	}
}
import java.awt.*;

class exp1 extends Frame{
	public exp1(){

		Button b1= new Button("YES");
		add(b1);
		b1.setSize(300,300);
		b1.setVisible(true);
		Button b2= new Button("NO");
		add(b2);
		b2.setSize(400,400);
		b2.setVisible(true);
		Label l1 = new Label("Enter:");
		add(l1);
		l1.setSize(500,500);
		l1.setVisible(true);
		b1.setBounds(20, 80, 80, 30);  
		b2.setBounds(20, 100, 80, 30);  
		l1.setBounds(100, 100, 80, 30);
		
	}
}
class awtexp{
	public static void main(String args[]){
		exp1 e= new exp1();
	}
}
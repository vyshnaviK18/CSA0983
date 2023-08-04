import java.awt.*;


public class Testawt extends Frame
{
    public Testawt()
    {
        Button btn=new Button("Hello World");
        add(btn); 		
        setSize(400, 500);       
        setTitle("StudyTonight");  
        setVisible(true);           
    }

    public static void main (String[] args)
    {
        Testawt ta = new Testawt();
    }
}
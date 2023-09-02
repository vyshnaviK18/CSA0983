import java.util.*;

class Forecast{
    public String date;
    float temp;
}

class Sunnyforecast extends Forecast{
    int humidity;
    String play;
    
    Sunnyforecast(String x,int y,int a,String b){
        date=x;
        temp=y;
        humidity=a;
        play=b;
    }
    void print(){
        System.out.println("Date="+date);
        System.out.println("Temperature="+temp);
        System.out.println("Humidity="+humidity);
        System.out.println("Play="+play);
    }
}
class Rainyforecast extends Forecast{
    String play1,windy;
    
    Rainyforecast(String i,int j,String k,String l){
        date=i;
        temp=j;
        windy=k;
        play1=l;
    }
    void print(){
        System.out.println("Date="+date);
        System.out.println("Temperature="+temp);
        System.out.println("Windy="+windy);
        System.out.println("Play="+play1);
    }
}

classforecastinheritance{
    public static void main(String args[]){
        Sunnyforecast s= new Sunnyforecast("12/03/2003",31,23,"yes");
        s.print();
        Rainyforecast sa= new Rainyforecast("11/03/2004",18,"yes","no");
        sa.print();
    }
}

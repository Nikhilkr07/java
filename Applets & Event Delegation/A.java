//
import java.applet.*;

public class A extends Applet{
    int i = 0;
    public void init(){
        i  = 10;
        System.out.println("init is called");
    }

    public void start(){
        i = i+10;
        System.out.println("Start  " +i);
    }

    public void stop(){
        i = 9;
        System.out.println("Stop " + i);
    }

    public void destroy(){
        i = 0;
        System.out.println("Destroyed");
    }
}

// <applet code = "A" width = 500 height = 500>
// </applet>

import java.applet.Applet;
import java.awt.Graphics;

/* 
<applet code="MyApplet", width="300", height="300">
</applet>
*/

public class DemoApplet extends Applet{
	public void init(){
		System.out.println("INIT Block");		
	}

	public void start(){
		System.out.println("Start Block");
	}
	
	public void paint(Graphics g){
		System.out.println("Paint Block");
		g.drawString("Viren", 50, 60);
        g.drawRect(50, 60, 30, 30);
	}

	public void stop(){
		System.out.println("Stop Block");
	}

	public void destroy(){
		System.out.println("Destroy Block");
	}
}





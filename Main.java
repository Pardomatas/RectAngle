import java.applet.Applet;
import java.awt.*;


public class Main extends Applet{
	
	RectAngle[] rectAngles = new RectAngle[20];
	int[] width = new int [20];
	
    public void start() {
        
    	
        setSize(500, 500);
        for(int i = 0; i < 20; i++)
        {
        	width[i] = (int) (Math.random() * 350);
        }
    
    }
    
    public void paint(Graphics page){
        boolean red = true; //To alternate between red and black colors.
        //A for-loop to draw the filled rectangles.
        int x = 10, y = 10, height = 20;
        for(int i = 0; i < 20; i++)
        	if(red == true)
        	{
        		page.setColor(Color.RED);
        		page.fillRect(x, y, width[i], height);
        		y = y + 20;
        		red = false;
        	}
        	else
        	{
        		page.setColor(Color.BLACK);
        		page.fillRect(x, y, width[i], height);
        		y = y + 20;
        		red = true;
        		
        	}

      }

} 
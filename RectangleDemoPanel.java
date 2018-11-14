import java.awt.Color;
import java.awt.Graphics;

public class RectangleDemoPanel extends MyPanel {
	public RectangleDemoPanel()
	{
		super();
		
	}
	@Override
	protected void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		
g.setColor(Color.BLACK);
		
		int startx = 10;
		int starty = 10;
		
		int endX = 280;
		
		int endY = 280;
		
		g.drawRect(startx, starty, endX, endY);
		g.fillRect(startx, starty,endX, endY);
	}

}

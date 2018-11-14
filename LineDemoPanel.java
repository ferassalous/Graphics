import java.awt.Color;
import java.awt.Graphics;

public class LineDemoPanel extends MyPanel {

	public LineDemoPanel() {
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
		
		g.drawLine(startx, starty, endX, endY);
		
	}

}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JPanel;

public class JPaper extends JPanel {

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(640,480);
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		Graphics2D graphics2d = (Graphics2D) graphics;
		
		graphics.setColor(Color.RED);
		graphics.fillRect(10, 10, 360, 110);
		
		Color bigBlueMarble = new Color(17, 37, 110);
		graphics.setColor(bigBlueMarble);
		
		//graphics.fillRect(10, 10, 360, 110);
		
		Path2D triangle = new Path2D.Double();
		triangle.moveTo(10, 10);
		triangle.lineTo(180, 110);
		triangle.lineTo(360, 10);
		triangle.closePath();
		
		graphics2d.fill(triangle);

	}

	

}

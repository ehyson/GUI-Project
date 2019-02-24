import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class slowDot extends JPanel implements ActionListener {
	
	Timer time = new Timer(5, this);
	Random rand = new Random();
	
	double x = rand.nextInt(350) + 1;
	double y = rand.nextInt(350) + 1;
	double x2 = rand.nextInt(350) + 1;
	double y2 = rand.nextInt(350) + 1;
	double x3 = rand.nextInt(350) + 1;
	double y3 = rand.nextInt(350) + 1;
	double x4 = rand.nextInt(350) + 1;
	double y4 = rand.nextInt(350) + 1;
	double x5 = rand.nextInt(350) + 1;
	double y5 = rand.nextInt(350) + 1;
	
	double velX = 2;
	double velY = 2;
	double velX2 = 3;
	double velY2 = 3;
	double velX3 = 2;
	double velY3 = 2;
	double velX4 = 3;
	double velY4 = 3;
	double velX5 = 3;
	double velY5 = 3;
	
	
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		Graphics2D d = (Graphics2D) g;
		g.setColor(Color.BLUE);
		Ellipse2D dot = new Ellipse2D.Double(x, y, 15, 15);
		Ellipse2D dot2 = new Ellipse2D.Double(x2, y2, 15, 15);
		Ellipse2D dot3 = new Ellipse2D.Double(x3, y3, 15, 15);
		Ellipse2D dot4 = new Ellipse2D.Double(x4, y4, 15, 15);
		Ellipse2D dot5 = new Ellipse2D.Double(x5, y5, 15, 15);
		d.fill(dot);
		d.fill(dot2);
		d.fill(dot3);
		d.fill(dot4);
		d.fill(dot5);
		time.start();
	}

	
	
	public void actionPerformed( ActionEvent e )
	{
		//Dot1
		if( x < 0 || x > 360 )
		{
			velX = -velX;
		}
		if( y < 0 || y > 360 )
		{
			velY = -velY;
		}
		
		
		
		//Dot2
		if( x2 < 0 || x2 > 360 )
		{
			velX2 = -velX2;
		}
		if( y2 < 0 || y2 > 360 )
		{
			velY2 = -velY2;
		}
		
		
		
		
		//Dot3
		if( x3 < 0 || x3 > 360 )
		{
			velX3 = -velX3;
		}
		if( y3 < 0 || y3 > 360 )
		{
			velY3 = -velY3;
		}
		
		
		
		//Dot4
		if( x4 < 0 || x4 > 360 )
		{
			velX4 = -velX4;
		}
		if( y4 < 0 || y4 > 360 )
		{
			velY4 = -velY4;
		}
		
		
		
		//Dot 5
		if( x5 < 0 || x5 > 360 )
		{
			velX5 = -velX5;
		}
		
		if( y5 < 0 || y5 > 360 )
		{
			velY5 = -velY5;
		}
		
		
		
		x += velX;
		y += velY;
		x2 += velX2;
		y2 += velY2;
		x3 += velX3;
		y3 += velY3;
		x4 += velX4;
		y4 += velY4;
		x5 += velX5;
		y5 += velY5;
		repaint();
		
	}

}

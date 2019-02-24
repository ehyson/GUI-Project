import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	JFrame window = new JFrame( "Maxwell's Demon");
	fastDot dotPanel1 = new fastDot();
	slowDot dotPanel2 = new slowDot();
	
	JPanel panel = new JPanel(new GridLayout(1,2));
	
	
	Window()
	{
		dotPanel1.setBackground(Color.PINK);
		dotPanel2.setBackground(Color.CYAN);
		
		panel.add(dotPanel1);
		panel.add(dotPanel2);
		
		window.add(panel);
		
		window.setSize(600, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}

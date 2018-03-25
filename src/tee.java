import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tee extends JPanel{

	public void paintComponent(Graphics graph){
		super.paintComponent(graph);
		this.setBackground(Color.RED);
		
		graph.setColor(Color.BLUE);
		graph.fillRect(25,  60,  100,  30);
		
		graph.setColor(Color.GREEN);
		graph.fillOval(150, 35, 75, 75);
		
		graph.setColor(Color.YELLOW);
		graph.fillRect(260,  60,  100, 30);
		
		graph.setColor(Color.WHITE);
		graph.drawString("Hello Utopian", 145, 130);
		
		graph.setColor(Color.WHITE);
		graph.drawString("I am @teekingtv and here is a tutorial on Java", 80, 155);
		
	}                                                             
}

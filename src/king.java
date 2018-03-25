import javax.swing.*;

public class king {

	public static void main(String[] args) {
		
		JFrame w = new JFrame ("Title");
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tee t = new tee();
		w.add(t);
		w.setSize(400, 250);
		w.setVisible(true);

	}

}

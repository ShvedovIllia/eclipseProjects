package Test;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("MyFirstApp");
		JButton button = new JButton ("CLick");
		JPanel panel = new JPanel ();

		panel.add(button);
		frame.add(panel);
		
		button.addActionListener(new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello world!");
				
			}});
		
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

}

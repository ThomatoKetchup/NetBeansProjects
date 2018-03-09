package fr.paris.mvc;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {
	
	JFrame frame;
	JTextField field;
	JButton button;
	JLabel label;
	
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getField() {
		return field;
	}
	public JButton getButton() {
		return button;
	}
	public JLabel getLabel() {
		return label;
	}
	
	public void init() {
	
		frame = new JFrame("Ex GUI");
		field = new JTextField();
		field.setColumns(10);
		button = new JButton("OK");
		label = new JLabel("vide");
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.setVisible(true);
		frame.pack();
	}
}

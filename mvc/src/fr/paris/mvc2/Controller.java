package fr.paris.mvc2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controller implements ActionListener {
	
	Model m;
	JTextField field;
	JLabel label;
	
	public Controller(Model m, JTextField field, JLabel label) {
		this.m = m;
		this.field = field; 
		this.label = label;
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {		
		m.setValeur(field.getText());
		//label.setText(m.getValeur()); #plus besoin de le faire
		
	}

}

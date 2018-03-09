package fr.paris.mvc2;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class JLabelObserver extends JLabel implements Observer {

	public JLabelObserver(String l) {
		super(l);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		//c'est la methode qui sera lancée quand le sujet aura changé
		Model m = (Model) o;
		setText(m.getValeur());

	}

}

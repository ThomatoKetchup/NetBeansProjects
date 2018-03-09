package fr.paris.mvcjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

	@FXML
	private Text output;

	private long number1 = 0;
	private String operator = "";
	private boolean start = true;

	private Model model = new Model();

	@FXML
	private void processNumpad(ActionEvent event) { //event = quand j'appuie sur les boutons
		if (start) {
			output.setText("");
			start = false;
		}

		String value = ((Button) event.getSource()).getText(); //ce que vaut value est la valeur de ce que j'appuie stoché ds fxml
		output.setText(output.getText() + value); 
	}

	@FXML
	private void processOperator(ActionEvent event) {
		String value = ((Button) event.getSource()).getText(); 

		if (!"=".equals(value)) {
			if (!operator.isEmpty())
				return;

			operator = value;
			number1 = Long.parseLong(output.getText());
			output.setText("");
		} else {
			if (operator.isEmpty())
				return;

			output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator))); //appel la fonction calculter from model
			operator = "";
			start = true;
		}
	}
}

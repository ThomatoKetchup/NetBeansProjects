package fr.paris.calculateur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {

	@FXML
	private Text output;  //output et menubar sont aussi dans le fichier fxml
	  
	private long number1 = 0; 
	private String operator = "";
	private boolean start = true;

	private Model model = new Model();

	@FXML
	private void processNumpad(ActionEvent event) {  //lorsqu'on appuie sur le bouton Action Event event prend le chiffre
		if (start) {
			output.setText("");
			start = false;
		}

		String value = ((Button) event.getSource()).getText(); //prend ce qui vient d'être cliquer (source) et prend sa partie "text"
		output.setText(output.getText() + value);
	}
	
	@FXML
	private void processDelete(ActionEvent event) {
		output.setText("");
		start = false; //pour réiinustilaiser le compteur 
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
			System.out.println("n1: "+number1);
			System.out.println("out: "+output.getText());
			System.out.println("op: "+operator);
			
			if ("x2".equals(operator)) {
				output.setText(String.valueOf(model.calculateUnary(number1, operator))); //on va voir le model our qu'il me dise que faire si qqn appuie sur ^2 
			} else {
				output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
			}
			
			operator = "";
			start = true;
		}
	}
	
	 /**
	   * Handle action related to input (in this case specifically only responds to
	   * keyboard event CTRL-A).
	   * 
	   * @param event Input event.
	   */
	  @FXML
	  private void handleKeyInput(final InputEvent event)
	  {
	     if (event instanceof KeyEvent)
	     {
	        final KeyEvent keyEvent = (KeyEvent) event;
	        if (keyEvent.isControlDown() && keyEvent.getCode() == KeyCode.A)
	        {
	           //provideAboutFunctionality();
	        }
	     }
	  }
	  
	  /**
	   * Perform functionality associated with "About" menu selection or CTRL-A.
	   */
	  private void provideAboutFunctionality()
	  {
	     System.out.println("You clicked on About!");      
	  }

}

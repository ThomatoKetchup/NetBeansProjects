/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatriceaoo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private Calculatrice c;

    public App() {
        c = new Calculatrice();
        try {
            c.addOperation("+", new Addition());
            c.addOperation("-", new Soustraction());
            c.addOperation("/", new Division()); //Il faut necessairement que Division implément opération, sinon il ne peut pas $etre de type operation
            c.addOperation("*", new Multiplication());
        } catch (ExceptionOperationExistante e) {

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml")); //"la vue est dans le UI Fxml, on la charge avec get resource
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

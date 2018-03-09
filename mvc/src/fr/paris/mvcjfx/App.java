package fr.paris.mvcjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml")); //appel le fichier fxml(il y a les tailles des boutons posetc

        primaryStage.setScene(new Scene(root)); //préare la scène
        primaryStage.show();  //affiche scène
    }

    public static void main(String[] args) {
        launch(args); //lancer jave FX et appel start
    }
}

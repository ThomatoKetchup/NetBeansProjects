package carnet;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	@Override
    public void start(Stage primaryStage) throws Exception {
       //GUI gui = new GUI();
		GUI2 gui = new GUI2();
		gui.initialize(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

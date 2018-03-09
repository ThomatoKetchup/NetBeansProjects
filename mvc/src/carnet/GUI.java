package carnet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class GUI {
 
    private TableView<PersonEntry> table = new TableView<PersonEntry>();
    private final ObservableList<PersonEntry> data =
        FXCollections.observableArrayList(
            new PersonEntry("A", "B", "a.b@example.com", "12345678", "address1"),
            new PersonEntry("C", "D", "c.d@example.com", "34534534", "address2"),
            new PersonEntry("E", "F", "e.f@example.com", "13123123", "address3")            
        );
    
    final HBox hb = new HBox();
    
    public void initialize(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Carnet d'adresses");
        stage.setWidth(650);
        stage.setHeight(500);
 
        table.setEditable(true);
 
        TableColumn firstNameCol = new TableColumn("Prénom");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Nom");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("lastName"));
 
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("email"));
        
        TableColumn telCol = new TableColumn("Téléphone");
        telCol.setMinWidth(100);
        telCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("telephoneNb"));
 
        TableColumn addrCol = new TableColumn("Adresse");
        addrCol.setMinWidth(100);
        addrCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("address"));
        
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol, telCol, addrCol);
         
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
 
} 
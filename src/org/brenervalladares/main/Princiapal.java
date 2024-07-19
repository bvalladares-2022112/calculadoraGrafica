/*
    Programador: Brener Roberto Valladares Chian
    Codigo Tecnico: IN5AM
    Carne: 2022112
    Fecha de creacion: 21/02/2023
    Fecha de modificacion: 21/02/2023
 */
package org.brenervalladares.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Princiapal extends Application {
    
 
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

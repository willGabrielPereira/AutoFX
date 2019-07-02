/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import reflection.Reflection;
import testes.Coisa;

/**
 *
 * @author willg
 */
public class AutoFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Reflection r = Reflection.getInstance(Coisa.class);
        
        CriadorInterface cp = CriadorInterface.getInstance(r);
        cp.iniciaCena();
        
        Scene scene = cp.getCena();
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

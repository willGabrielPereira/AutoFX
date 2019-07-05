/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeframework;

import javafx.application.Application;
import javafx.stage.Stage;
import autoFX.AutoFX;

/**
 *
 * @author willg
 */
public class TesteFramework extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AutoFX fx = AutoFX.getInstance(Simples.class, primaryStage);
        fx.apresentarTela();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerRegister;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Ismael
 */
public class MainProgram extends Application {

    private PlayerRegister playerRegister;

    @Override
    public void init() throws Exception {
        this.playerRegister = new PlayerRegister();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Registro de Jugadores");
        InputView inputView = new InputView(this.playerRegister);
        
       
        Button anteriorView = new Button("Ir a seleccionar personajes");
        anteriorView.setFont(Font.font("Arial", 15));
        anteriorView.setMinSize(100, 35);      
        
        BorderPane layout = new BorderPane();
        layout.setCenter(inputView.getView());
        layout.setBottom(anteriorView);
        layout.setPadding(new Insets(5, 5, 5, 5));
      
        //ESTA PARTE ES PARA QUE VAYA A LA OTRA PANTALLA
        AuxiliarView anterior = new AuxiliarView();
        anteriorView.setOnAction((event) -> {
            layout.setCenter(anterior.getView());
        });
        //HASTA AQUÍ
        
        Scene view = new Scene(layout, 470, 500);

        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) throws Exception {


        launch(MainProgram.class);
        //System.out.println(playerRegister.getAllUserIDs());
        //System.out.println(playerRegister.toString());
    }

//    public static void print(PlayerRegister toPrint) {
//
//    }
}

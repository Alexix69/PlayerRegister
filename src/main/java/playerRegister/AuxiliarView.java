/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerRegister;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


//ESTA CLASE ERA SOLO PARA PROBAR EL CAMBIO DE PANTALLA CON EL BOTÓN
public class AuxiliarView {
    
    public Parent getView(){
        BorderPane layout = new BorderPane();
        Label newLabel = new Label("AQUÍ IRIA LA OTRA PANTALLA");
        
       layout.setCenter(newLabel);
        
        return layout;
    }
}

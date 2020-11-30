/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerRegister;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

<<<<<<< HEAD

//ESTA CLASE ERA SOLO PARA PROBAR EL CAMBIO DE PANTALLA CON EL BOTÓN
=======
/**
 *
 * @author Ismael
 */

//ESTA CLASE NO DEBE IR EN EL PROYECTO, ES AUXILIAR
>>>>>>> main
public class AuxiliarView {
    
    public Parent getView(){
        BorderPane layout = new BorderPane();
        Label newLabel = new Label("AQUÍ IRIA LA OTRA PANTALLA");
        
       layout.setCenter(newLabel);
        
        return layout;
    }
}

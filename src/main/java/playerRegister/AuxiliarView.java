
package playerRegister;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;




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

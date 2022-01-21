/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koalafix;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.StageStyle;

/**
 *
 * @author Istúriz
 */
public class FormularioController implements Initializable {
   

    
    @FXML
    private ComboBox<String> comboTipoEquipo;
    
    @FXML
    private RadioButton siButton, noButton;
    
    @FXML
    private TextField nombre, id;
    
    @FXML
    private TextArea descripcion, fallas;
    
    @FXML
    private DatePicker fecha;

    @FXML
    private Button btnAceptar;
    
    @FXML
    private MenuItem reiniciar, cerrar, sobreNosotros;
    
    ToggleGroup garantiaGroup;
    
    
    public void guardarDatos(){
        GuardarFormulario gf = new GuardarFormulario();
            
        
            gf.setNombre(nombre.getText());
            gf.setCedula(id.getText());
            gf.setDescripcion(descripcion.getText());
            gf.setFallas(fallas.getText());
            
            System.out.println(gf.getNombre());
            System.out.println(gf.getCedula());
            System.out.println(gf.getDescripcion());
            System.out.println(gf.getFallas());
            
            
    }
    
    public void cleanFields(){
        //tipoEquipo.valueProperty().set(null);
        noButton.setSelected(false);
        siButton.setSelected(false);
        comboTipoEquipo.setValue(null);
        fecha.setValue(null);
        nombre.setText("");
        id.setText("");
        descripcion.setText("");
        fallas.setText("");
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> TipoEquipo = FXCollections.observableArrayList("Computadora","Monitor","Regulador","Teléfono","otro");
        comboTipoEquipo.setItems(TipoEquipo); 
        
        garantiaGroup = new ToggleGroup();
        
        siButton.setToggleGroup(garantiaGroup);
        noButton.setToggleGroup(garantiaGroup);
        
        
        reiniciar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cleanFields();
                guardarDatos();
            }
        });
        
        cerrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        
        btnAceptar.setOnAction((ActionEvent e) ->{
            guardarDatos();
            cleanFields();
            
        });
        
        sobreNosotros.setOnAction((ActionEvent e) ->{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.initStyle(StageStyle.UTILITY);
            alert.setTitle("Sobre nosotros");
            alert.setHeaderText(null);
            alert.setContentText("Creado por Mauricio Istúriz");
            alert.showAndWait();
        });
        
        
    }    
    
}

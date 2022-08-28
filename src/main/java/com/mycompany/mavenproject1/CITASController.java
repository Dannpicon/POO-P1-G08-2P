/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import modelo.Cita;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class CITASController implements Initializable {

    @FXML
    private TextField nombreTextField;
    @FXML
    private DatePicker fechaDatePicker;
    @FXML
    private Button buscarButton;
    @FXML
    private TableView<Cita> citasTableView;
    @FXML
    private TableColumn<Cita, String> nombreColumn;
    @FXML
    private TableColumn<Cita, String> terapsitaColumn;
    @FXML
    private TableColumn<Cita, String> serviciosColumn;
    @FXML
    private TableColumn<Cita, String> fechaColumn;
    @FXML
    private TableColumn<Cita, String> horaColumn;
    @FXML
    private Button crearButton;
    @FXML
    private Button registrarButton;
    @FXML
    private Button consultarButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buscarButton.setOnMouseClicked(e->{
           
        });
        
        crearButton.setOnMouseClicked(e->{
            try {
                App.setRoot("CREARCITA");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        registrarButton.setOnMouseClicked(e->{
            try {
                App.setRoot("REGISTRARATENCION");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        consultarButton.setOnMouseClicked(e->{
            try {
                App.setRoot("CONSULTARACTIVIDAD");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        // TODO
    }
    
    
}
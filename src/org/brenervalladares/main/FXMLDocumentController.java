/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.brenervalladares.main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
        double valor1, valor2, result;
        int op;
        @FXML private TextField txtPantalla;
        @FXML private Button btnCero;
        @FXML private Button btnUno;
        @FXML private Button btnDos;
        @FXML private Button btnTres;
        @FXML private Button btnCuatro;
        @FXML private Button btnCinco;
        @FXML private Button btnSeis;
        @FXML private Button btnSiete;
        @FXML private Button btnOcho;
        @FXML private Button btnNueve;
        @FXML private Button btnMas;
        @FXML private Button btnMenos;
        @FXML private Button btnMultiplicacion;
        @FXML private Button btnDivision;
        @FXML private Button btnMasMenos;
        @FXML private Button btnPunto;
        @FXML private Button btnUnoX;
        @FXML private Button btnCuadrado;
        @FXML private Button btnRaiz;
        @FXML private Button btnPorcentaje;
        @FXML private Button btnCE;
        @FXML private Button btnC;
        @FXML private Button btnIgual;
        @FXML private ImageView imgCerrar;
        
        
        
        
        
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource() == btnMas){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            op = 1;  
        }else if (event.getSource() == btnMenos){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            op = 2; 
            
        }else if (event.getSource() == btnMultiplicacion){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);

            op = 3;
        
        }else if (event.getSource() == btnDivision){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);

            op = 4;
            
        }else if (event.getSource() == btnCuadrado){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = valor1 * valor1;
            txtPantalla.setText(String.valueOf(result));
            
        }else if (event.getSource() == btnRaiz){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = Math.sqrt(valor1);
            txtPantalla.setText(String.valueOf(result));
            
        }else if (event.getSource() == btnPorcentaje){
            valor2 = Double.parseDouble(txtPantalla.getText());
            valor2 = valor1* (valor2/100);
            txtPantalla.setText(String.valueOf(valor2));
        
        }else if (event.getSource() == btnUnoX){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result = 1 / valor1;
            txtPantalla.setText(String.valueOf(result));
            
        }else if (event.getSource() == btnMasMenos){
            valor1 = Double.parseDouble(txtPantalla.getText());
            valor1 = -valor1;
            txtPantalla.setText(String.valueOf(valor1));
        
        }else if (event.getSource() == btnC){
            valor1 = 0;
            valor2 = 0;
            result = 0;
            txtPantalla.setText("");
            
        }else if (event.getSource() == btnCE){
            valor2 = 0;
            txtPantalla.setText("");
        
         }else if (event.getSource() == btnPunto){
           txtPantalla.setText(txtPantalla.getText() + ("."));
           btnPunto.setDisable(true);
 
        }else if(event.getSource() == btnIgual){
            valor2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            switch(op){
                case 1:
                  result = valor1 + valor2;
                  txtPantalla.setText(String.valueOf(result)); 
                  break;
                case 2:
                    result = valor1 - valor2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 3:
                    result = valor1 * valor2;
                    txtPantalla.setText(String.valueOf(result)); 
                    break;
                case 4:
                    result = valor1 / valor2;
                    txtPantalla.setText(String.valueOf(result)); 
            }
         

        }
        
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}

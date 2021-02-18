package br.com.gabrielle.controller;

import br.com.gabrielle.util.Alerts;
import br.com.gabrielle.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    @FXML
    private TextField txtNumber1, txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    public void onBtSumClick() {
        try {
            double a = Double.parseDouble(txtNumber1.getText());
            double b = Double.parseDouble(txtNumber2.getText());
            double sum = a + b;
            System.out.println(sum);
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldMaxLength(txtNumber1, 14);
        Constraints.setTextFieldDouble(txtNumber2);
        Constraints.setTextFieldMaxLength(txtNumber2, 14);
    }
}

package com.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainSceneController {

    @FXML
    private TextField felszinField;

    @FXML
    private TextField magassagField;

    @FXML
    private TextField sugarField;

    @FXML
    void kilepGomb(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void szamolGomb(ActionEvent event) {
        startSzamitas();

    }

    private void startSzamitas(){
        String sugarStr = sugarField.getText();
        String magassagStr = magassagField.getText();

        double sugar = Double.parseDouble(sugarStr);
        double magassag = Double.parseDouble(magassagStr);

        

        

        

        

    

        
        Double felszin = 2*Math.PI*sugar*sugar + 2*Math.PI*sugar*magassag;
        felszinField.setText(felszin.toString());
        
        addToDatabase(sugar, magassag, felszin);
    }

    private void addToDatabase(Double sugar, Double magassag, Double felszin) {
        Henger henger = new Henger(sugar, magassag, felszin);
        DataSource.createCylinder(henger);
    }




}

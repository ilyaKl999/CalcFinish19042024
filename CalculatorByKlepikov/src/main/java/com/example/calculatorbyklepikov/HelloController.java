package com.example.calculatorbyklepikov;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text Text1;
    @FXML
    private Text Text2;
    @FXML
    private Button addit;
    @FXML
    private Button delenyie;
    @FXML
    private Button koren;
    @FXML
    private Button minus;
    @FXML
    private Button multiplic;
    @FXML
    private Button num0;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button num5;
    @FXML
    private Button num6;
    @FXML
    private Button num7;
    @FXML
    private Button num8;
    @FXML
    private Button num9;
    @FXML
    private Button rovno;
    @FXML
    private Button ydajinie;
    String expressionInterface= "";

    @FXML
    protected void command() {




    }

    @FXML
    protected void setNum() {

        num0.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num0.getText();
            Text1.setText(expressionInterface);
        });
        num1.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num1.getText();
            Text1.setText(expressionInterface);
        });
        num2.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num2.getText();
            Text1.setText(expressionInterface);
        });
        num3.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num3.getText();
            Text1.setText(expressionInterface);
        });
        num4.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num4.getText();
            Text1.setText(expressionInterface);
        });
        num5.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num5.getText();
            Text1.setText(expressionInterface);
        });
        num6.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num6.getText();
            Text1.setText(expressionInterface);
        });
        num7.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num7.getText();
            Text1.setText(expressionInterface);
        });
        num8.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num8.getText();
            Text1.setText(expressionInterface);
        });
        num9.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface + num9.getText();
            Text1.setText(expressionInterface);
        });

        addit.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface +" "+ addit.getText()+" ";
            Text1.setText(expressionInterface);
        });
        delenyie.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface+" "+ delenyie.getText()+" ";
            Text1.setText(expressionInterface);
        });

        multiplic.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface +" "+ multiplic.getText()+" ";
            Text1.setText(expressionInterface);
        });

        minus.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface +" "+ minus.getText()+" ";
            Text1.setText(expressionInterface);
        });

        koren.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface+" "+ koren.getText()+" ";
            Text1.setText(expressionInterface);
        });

        ydajinie.setOnAction(actionEvent -> {
            expressionInterface = "";
            Text1.setText(expressionInterface);
            Text2.setText(expressionInterface);
        });


        rovno.setOnAction(actionEvent -> {
            expressionInterface = expressionInterface +" "+ rovno.getText() +" ";
            Text1.setText(" ");

            if (expressionInterface.contains("+")){
                String[] array= expressionInterface.split(" ");
                System.out.println(expressionInterface);
                try {


                int a = Integer.parseInt(array[0]);
                int b = Integer.parseInt(array[2]);
                int c = a+b;
                String cc= Integer.toString(c);

                Text2.setText(expressionInterface + cc);}catch (Exception a) {Text2.setText("Error");}


            }
        });



    }




}
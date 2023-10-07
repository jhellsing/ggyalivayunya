package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.EventObject;

public class HelloController {
    @FXML
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13;
    @FXML
    private Pane pane1, pane2;
    @FXML
    private TextField textField1;
    @FXML
    private Label  label2, label3;
    private EventObject event;


    @FXML
    private void button1_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button1.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button2_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button2.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button3_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button3.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button4_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button4.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button5_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button5.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button6_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button6.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button7_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button7.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button8_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button8.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }

    @FXML
    private void button9_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button9.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
    }


    @FXML
    private void button10_Click(ActionEvent event)                   //сохранение в зависимости от нажатого места
    {
        if (event.getSource() == button1)
        {
            saveClick(button1);
        }
        else if (event.getSource() == button2)
        {
            saveClick(button2);
        }
        else if (event.getSource() == button3)
        {
            saveClick(button3);
        }
        else if (event.getSource() == button4)
        {
            saveClick(button4);
        }
        else if (event.getSource() == button5)
        {
            saveClick(button5);
        }
        else if (event.getSource() == button6)
        {
            saveClick(button6);
        }
        else if (event.getSource() == button7)
        {
            saveClick(button7);
        }
        else if (event.getSource() == button8)
        {
            saveClick(button8);
        }
        else if (event.getSource() == button9)
        {
            saveClick(button9);
        }
    }
    @FXML
    private void saveClick(Button button)                           // метод, который сохраняет запись
    {
        String getName = textField1.getText();
        if (getName.equals("СВОБОДНО"))
        {
            label3.setVisible(true);
            textField1.setStyle("-fx-background-color:  #F4A460;");
        }
        else
        {
            label3.setVisible(false);
            textField1.setStyle("-fx-background-color:  #C0C0C0;");
            button.setText(getName);
            button.setStyle("-fx-background-color: #98FB98;");
            pane2.setVisible(false);
        }

    }

    @FXML
    private void bookClick(Button button)              //метод, который бронирует
    {
        String getName = textField1.getText();
        if (getName.equals("СВОБОДНО"))
        {
            label3.setVisible(true);
            textField1.setStyle("-fx-background-color:  #F4A460;");
        }
        else
        {
            label3.setVisible(false);
            textField1.setStyle("-fx-background-color:  #C0C0C0;");
            button.setText(getName);
            button.setStyle("-fx-background-color:  #F4A460;");
            pane2.setVisible(false);
        }
    }


    @FXML
    private void button11_Click(ActionEvent event)                //бронь места, в зависимости от нажатой кнопки
    {
        {
            if (event.getSource() == button1)
            {
                bookClick(button1);
            }
            else if (event.getSource() == button2)
            {
                bookClick(button2);
            }
            else if (event.getSource() == button3)
            {
                bookClick(button3);
            }
            else if (event.getSource() == button4)
            {
                bookClick(button4);
            }
            else if (event.getSource() == button5)
            {
                bookClick(button5);
            }
            else if (event.getSource() == button6)
            {
                bookClick(button6);
            }
            else if (event.getSource() == button7)
            {
                bookClick(button7);
            }
            else if (event.getSource() == button8)
            {
                bookClick(button8);
            }
            else if (event.getSource() == button9)
            {
                bookClick(button9);
            }
        }
    }

    @FXML
    private void button12_Click()   //удаление в зависимости от выбранной кнопки
    {

            if (event.getSource() == button1)
            {
                deleteClick(button1);
            }
            else if (event.getSource() == button2)
            {
                deleteClick(button2);
            }
            else if (event.getSource() == button3)
            {
                deleteClick(button3);
            }
            else if (event.getSource() == button4)
            {
                deleteClick(button4);
            }
            else if (event.getSource() == button5)
            {
                deleteClick(button5);
            }
            else if (event.getSource() == button6)
            {
                deleteClick(button6);
            }
            else if (event.getSource() == button7)
            {
                deleteClick(button7);
            }
            else if (event.getSource() == button8)
            {
                deleteClick(button8);
            }
            else if (event.getSource() == button9)
            {
                deleteClick(button9);
            }
    }

    @FXML
    private void deleteClick(Button button)   //удаление
    {
        String getName = button.getText();
        textField1.setText(getName);
        button.setText("СВОБОДНО");
        button.setStyle("-fx-background-color:  #C0C0C0;");
        pane2.setVisible(false);
    }

    @FXML
    private void button13_Click()
    {
        pane2.setVisible(false);
    }

}
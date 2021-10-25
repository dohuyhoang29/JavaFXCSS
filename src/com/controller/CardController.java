/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Book;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author hoang
 */
public class CardController implements Initializable {
    @FXML
    private HBox box;

    @FXML
    private ImageView bookImage;

    @FXML
    private Label name;

    @FXML
    private Label author;

    @FXML
    private Label price;

    private String [] colors = {"B9E5FF", "BDB2FE", "FB9AA8", "FF5060"};
    /**
     * Initializes the controller class.
     */
    public void setData (Book book) {
        Image image = new Image(getClass().getResourceAsStream(book.getImageSrc()));


        bookImage.setImage(image);
        name.setText(book.getName());
        author.setText(book.getAuthor());
        price.setText(book.getPrice());

        box.setStyle("-fx-background-color: #" + colors[(int)(Math.random()*colors.length)]+ ";" +
                    "-fx-background-radius: 15;" +
                    "-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0), 10, 0, 0, 10);");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

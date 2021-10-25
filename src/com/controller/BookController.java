package com.controller;

import com.model.Book;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BookController implements Initializable {

  @FXML
  private ImageView bookImage;

  @FXML
  private Label name;

  @FXML
  private Label author;

  @FXML
  private Label price;

  public void setData (Book book) {
    Image image = new Image(getClass().getResourceAsStream(book.getImageSrc()));

    bookImage.setImage(image);
    name.setText(book.getName());
    author.setText(book.getAuthor());
    price.setText(book.getPrice());
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}

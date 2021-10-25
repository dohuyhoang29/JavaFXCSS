/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Book;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author hoang
 */
public class SimpleController implements Initializable {

  @FXML
  private HBox carLayout;

  @FXML
  private GridPane bookContainer;

  private List<Book> recentlyAdded;
  private List<Book> recommended;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
    recentlyAdded = new ArrayList<>(recentlyAdded());
    recommended = new ArrayList<>(books());

    int column = 0;
    int row = 1;

    try {
      for (Book book : recommended) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../view/Book.fxml"));
        VBox bookBox = fxmlLoader.load();
        BookController bookController = fxmlLoader.getController();
        bookController.setData(book);

        if(column == 6) {
          column = 0;
          ++row;
        }

        bookContainer.add(bookBox, column++, row);
        GridPane.setMargin(bookBox, new Insets(10));
      }
      for (int i = 0; i < recentlyAdded.size(); i++) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../view/CardUI.fxml"));
        HBox cardBox = fxmlLoader.load();
        CardController cardController = fxmlLoader.getController();
        cardController.setData(recentlyAdded.get(i));
        carLayout.getChildren().add(cardBox);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private List<Book> recentlyAdded() {
    List<Book> ls = new ArrayList<>();
    Book book = new Book();
    book.setName("Harry Potter");
    book.setImageSrc("../imgs/harry_potter.jpg");
    book.setAuthor("L.K.Rowling");
    book.setPrice("95$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    return ls;
  }

  private List<Book> books() {
    List<Book> ls = new ArrayList<>();
    Book book = new Book();
    book.setName("Harry Potter");
    book.setImageSrc("../imgs/harry_potter.jpg");
    book.setAuthor("L.K.Rowling");
    book.setPrice("95$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    book = new Book();
    book.setName("The Alchemit");
    book.setImageSrc("../imgs/the_alchemit.jpg");
    book.setAuthor("Paulo Coelho");
    book.setPrice("115$");
    ls.add(book);

    book = new Book();
    book.setName("The Lord of the Rings");
    book.setImageSrc("../imgs/the_lord_of_the_rings.jpg");
    book.setAuthor(" J.R.R. Tolkien");
    book.setPrice("125$");
    ls.add(book);

    return ls;
  }
}

package com.model;

public class Book {
  private String name;
  private String ImageSrc;
  private String author;
  private String price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageSrc() {
    return ImageSrc;
  }

  public void setImageSrc(String imageSrc) {
    ImageSrc = imageSrc;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }
}

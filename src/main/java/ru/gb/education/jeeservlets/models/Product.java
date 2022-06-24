package ru.gb.education.jeeservlets.models;

public class Product {
  private final Integer id;
  private final String name;

  public Product(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

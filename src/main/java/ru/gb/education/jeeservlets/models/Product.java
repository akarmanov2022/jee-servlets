package ru.gb.education.jeeservlets.models;

import java.text.DecimalFormat;

public class Product {
  private final Integer id;
  private final String title;
  private final Double cost;

  public Product(Integer id, String title, Double cost) {
    this.id = id;
    this.title = title;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", cost=" + DecimalFormat.getInstance().format(cost) +
        '}';
  }
}

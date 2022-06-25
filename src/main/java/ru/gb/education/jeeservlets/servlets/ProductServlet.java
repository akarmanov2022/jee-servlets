package ru.gb.education.jeeservlets.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.gb.education.jeeservlets.models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet(name = "ProductServlet", urlPatterns = {"/products"})
public class ProductServlet extends HttpServlet {
  private final static Logger LOGGER = LoggerFactory.getLogger(ProductServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    LOGGER.info("Get 10 products");
    resp.getWriter().print("<html><body>");
    resp.setContentType("text/html");

    for (int i = 0; i < 10; i++) {
      double cost = ThreadLocalRandom.current().nextDouble(100);
      Product product = new Product(i, String.format("Product %d", i), cost);
      resp.getWriter().print(product);
      resp.getWriter().print("\n");
    }
    resp.getWriter().print("</body><html>");
    resp.getWriter().close();
  }
}

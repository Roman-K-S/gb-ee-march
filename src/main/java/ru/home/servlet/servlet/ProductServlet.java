package ru.home.servlet.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.home.servlet.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", products);

        getServletContext().getRequestDispatcher("/product.jsp").forward(req,resp);
    }

    List<Product> products = List.of(
            new Product(1,"Milk", 112),
            new Product(2,"Sugar",79),
            new Product(3, "Bread",55)
            );
}

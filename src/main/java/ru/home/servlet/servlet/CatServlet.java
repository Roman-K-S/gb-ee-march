package ru.home.servlet.servlet;

import ru.home.servlet.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatServlet", urlPatterns = "/cat")
public class CatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cat", createCat());
        getServletContext().getRequestDispatcher("/cat.jsp")
                .forward(req,resp);
    }

    private Cat createCat() {
        List<Cat> cats = List.of(
                new Cat("Murzik",1, null),
                new Cat("Snezhok",1,null),
                new Cat("Pushok",3,null)
        );

        return Cat.builder()
                .name("Batsik")
                .age(3)
                .children(cats)
                .build();
    }
}

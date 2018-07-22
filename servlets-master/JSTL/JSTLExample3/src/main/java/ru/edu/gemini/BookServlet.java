package ru.edu.gemini;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookServlet", urlPatterns = "/bookservlet")
public class BookServlet extends HttpServlet {

    private List<Book> bookList;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        bookList = new ArrayList<>();
        bookList.add(new Book("Book1","Author1",10));
        bookList.add(new Book("Book2","Author2",20));
        bookList.add(new Book("Book3","Author3",30));
        bookList.add(new Book("Book4","Author4",40));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("books", bookList);

        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}

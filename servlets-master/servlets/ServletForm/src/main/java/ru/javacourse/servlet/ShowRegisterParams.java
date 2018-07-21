package ru.javacourse.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "ShowRegisterParams",urlPatterns = "/showRegisterParameters")
public class ShowRegisterParams extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String age = request.getParameter("age");

//        // Вариант для просмотра всех параметров взапросе
//        for(Enumeration en = request.getParameterNames(); en.hasMoreElements();) {
//            String name = (String)en.nextElement();
//            String value = request.getParameter(name);
//            System.out.println("Name:" + name);
//            System.out.println("Value:" + value);
//        }

        // Также обратите внимание, что может быть вызов для получения нескольких величин
        //String[] values = request.getParameterValues("check");

        response.setContentType("text/html;charset=UTF-8");

        try(PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowParameterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowParameterServlet</h1>");
            out.println("<h1>Parameter1 = " + login + "</h1>");
            out.println("<h1>Parameter2 = " + password + "</h1>");
            out.println("<h1>Parameter3 = " + email + "</h1>");
            out.println("<h1>Parameter4 = " + age + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}

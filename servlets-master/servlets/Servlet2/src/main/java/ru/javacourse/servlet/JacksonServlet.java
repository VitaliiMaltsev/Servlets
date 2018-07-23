package ru.javacourse.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.javacourse.model.Person;
import ru.javacourse.util.PersonStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "JacksonServlet", urlPatterns = "/jackson")
public class JacksonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> personList = PersonStorage.getPersons();

        ObjectMapper mapper = new ObjectMapper();
        String jackson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personList);

        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        writer.write(jackson);

        writer.flush();
        writer.close();

//        ObjectMapper mapper = new ObjectMapper();

    }
}

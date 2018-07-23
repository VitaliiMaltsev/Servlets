package ru.javacourse.servlet;

import ru.javacourse.model.PersonList;
import ru.javacourse.util.PersonStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;

@WebServlet(name = "XmlServlet", urlPatterns = "/xml")
public class XmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Person>personList = PersonStorage.getPersons();
//        Person person = PersonStorage.getPersons().get(0);
        PersonList persons = new PersonList();
        persons.setPersons(PersonStorage.getPersons());
//        List<Person> people = persons.getPersons();
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(PersonList.class);
            Marshaller jaxbMarshaller = null;
            jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(persons, resp.getWriter());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

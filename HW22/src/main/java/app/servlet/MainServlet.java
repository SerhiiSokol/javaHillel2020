package app.servlet;

import app.model.Student;
import app.modelDAO.StudentDAO;
import lombok.SneakyThrows;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class MainServlet extends HttpServlet {
    private app.modelDAO.StudentDAO StudentDAO;

    public void init() {
        String Url = getServletContext().getInitParameter("Url");
        String Username = getServletContext().getInitParameter("Username");
        String Password = getServletContext().getInitParameter("Password");
        StudentDAO = new StudentDAO(Url, Username, Password);
    }

    private final static String index = "/WEB-INF/view/index.jsp";
    private final static String studentForm = "/WEB-INF/view/StudentForm.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

    @lombok.SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String action = req.getServletPath();
        switch (action) {
            case "/new" -> studentAdd(req, resp);
            case "/insert" -> insertStudent(req, resp);
            case "/delete" -> deleteStudent(req, resp);
            default -> listStudent(req, resp);
        }
    }

    @SneakyThrows
    private void listStudent(HttpServletRequest req, HttpServletResponse resp) {
        ArrayList<Student> students = StudentDAO.select();
        req.setAttribute("st", students);
        getServletContext().getRequestDispatcher(index).forward(req, resp);
    }

    @SneakyThrows
    private void studentAdd(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher(studentForm);
        dispatcher.forward(request, response);
    }

    @SneakyThrows
    private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
        String Full_name = request.getParameter("Full_name");
        int group = Integer.parseInt(request.getParameter("group"));
        String Year_of_receipt = request.getParameter("Year_of_receipt") + "-09-01 12:00:00";
        Student newStudent = new Student(Full_name, group, Year_of_receipt);
        StudentDAO.insert(newStudent);
        response.sendRedirect("list");
    }

    @SneakyThrows
    private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));

        Student stud = new Student(id);
        StudentDAO.delete(stud);
        resp.sendRedirect("/list");
    }
}

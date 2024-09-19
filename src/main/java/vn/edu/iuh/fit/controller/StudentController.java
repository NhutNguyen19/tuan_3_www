package vn.edu.iuh.fit.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.iuh.fit.entity.Student;
import vn.edu.iuh.fit.processing.StudentProcessing;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controller", value = "/controller")
public class StudentController extends HttpServlet {

    @Inject
    private StudentProcessing processing;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action.equalsIgnoreCase("add")){
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            processing.addStudent(name, email);
        } else if(action.equalsIgnoreCase("students")){
            List<Student> students = processing.getAllStudents();
            HttpSession session= req.getSession(true);
            session.setAttribute("students", students);
            resp.sendRedirect("views/list_all_student.jsp");
        }
    }
}

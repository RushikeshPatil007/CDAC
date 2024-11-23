package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int deptId = Integer.parseInt(request.getParameter("deptId"));
        List<Employee> employees = new ArrayList<>();

        try {
            // Database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Employee WHERE dept_id = ?");
            pstmt.setInt(1, deptId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmp_id(rs.getInt("emp_id"));
                emp.setEmp_name(rs.getString("emp_name"));
                emp.setDept_id(rs.getInt("dept_id"));
                employees.add(emp);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Convert employee list to JSON and return as response
//        response.setContentType("application/json");
//        PrintWriter out = response.getWriter();
//        out.write(new Gson().toJson(employees));
//        out.close();
        jakarta.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        dispatcher.forward(request,response);
        
    }
}
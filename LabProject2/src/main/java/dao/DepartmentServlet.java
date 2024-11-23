package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Department;

public class DepartmentServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        List<Department> departments = new ArrayList<>();

	        try {
	            // Database connection
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Company", "root", "root");
	            Statement stmt = (Statement) conn.createStatement();
	            ResultSet rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM Department");

	            while (rs.next()) {
	                Department dept = new Department();
	                dept.setDept_id(rs.getInt("dept_id"));
	                dept.setDept_name(rs.getString("dept_name"));
	                dept.setLocation(rs.getString("location"));
	                departments.add(dept);
	            }

	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        // Set departments as request attribute and forward to JSP
	        request.setAttribute("departments", departments);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	        dispatcher.forward(request, response);
	    }
	}


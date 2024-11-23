<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Department" %>
<!DOCTYPE html>
<html>
<head>
    <title>Department and Employees</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        function showEmployees(deptId) {
            // AJAX call to fetch employee details for the selected department
            $.ajax({
                url: 'EmployeeServlet',
                type: 'GET',
                data: { deptId: deptId },
                success: function (data) {
                    // Populate employee details below the department table
                    let empTable = '<table border="1"><tr><th>ID</th><th>Name</th><th>Position</th><th>Salary</th></tr>';
                    data.forEach(function(emp) {
                        empTable += '<tr><td>' + emp.empId + '</td><td>' + emp.empName + '</td><td>' + emp.position + '</td><td>' + emp.salary + '</td></tr>';
                    });
                    empTable += '</table>';
                    $('#employeeDetails').html(empTable);
                }
            });
        }
    </script>
</head>
<body>
    <h1>Department Details</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Location</th>
            <th>Action</th>
        </tr>
        <%
            List<Department> departments = (List<Department>) request.getAttribute("departments");
            for (Department dept : departments) {
        %>
        <tr>
            <td><%= dept.getDept_id() %></td>
            <td><%= dept.getDept_name() %></td>
            <td><%= dept.getLocation() %></td>
            <td>
                <button onclick="showEmployees(<%= dept.getDept_id() %>)">View Employees</button>
            </td>
        </tr>
        <% } %>
    </table>
    
    <!-- Employee Details Section -->
    <div id="employeeDetails">
        <!-- Employee details will be displayed here -->
    </div>
</body>
</html>

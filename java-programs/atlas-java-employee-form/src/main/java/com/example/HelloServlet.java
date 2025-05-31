package com.example;

     import java.io.IOException;
     import java.io.PrintWriter;
     import javax.servlet.ServletException;
     import javax.servlet.annotation.WebServlet;
     import javax.servlet.http.HttpServlet;
     import javax.servlet.http.HttpServletRequest;
     import javax.servlet.http.HttpServletResponse;

     @WebServlet("/hello")
     public class HelloServlet extends HttpServlet {
         protected void doPost(HttpServletRequest request, HttpServletResponse response)
                 throws ServletException, IOException {
             response.setContentType("text/html");
             PrintWriter out = response.getWriter();
             
             // Retrieve form parameters
             String empName = request.getParameter("empName");
             String empId = request.getParameter("empId");
             String department = request.getParameter("department");
             String yearsExp = request.getParameter("yearsExp");
             String email = request.getParameter("email");
             
             // Start HTML response
             out.println("<html><body style='font-family: Arial, sans-serif; padding: 20px;'>");
             out.println("<h1>Employee Information Submitted</h1>");
             out.println("<h2>Details:</h2>");
             out.println("<p><strong>Employee Name:</strong> " + (empName != null && !empName.isEmpty() ? empName : "Not provided") + "</p>");
             out.println("<p><strong>Employee ID:</strong> " + (empId != null && !empId.isEmpty() ? empId : "Not provided") + "</p>");
             out.println("<p><strong>Department:</strong> " + (department != null && !department.isEmpty() ? department : "Not provided") + "</p>");
             out.println("<p><strong>Years of Experience:</strong> " + (yearsExp != null && !yearsExp.isEmpty() ? yearsExp : "Not provided") + "</p>");
             out.println("<p><strong>Company Mail ID:</strong> " + (email != null && !email.isEmpty() ? email : "Not provided") + "</p>");
             out.println("<p><a href='index.jsp' style='color: #0066C0; text-decoration: none;'>Go back to form</a></p>");
             out.println("</body></html>");
         }
     }
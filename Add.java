
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* 
            int a = Integer.parseInt(request.getParameter("num1"));
            int b = Integer.parseInt(request.getParameter("num2"));
            out.println("Addition is "+ (a+b));*/
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Addition Result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Result of Addition</h1>");
            int a = Integer.parseInt(request.getParameter("num1"));
            int b = Integer.parseInt(request.getParameter("num2"));
            out.println("<p>Addition of " + a + " and " + b + " is " + (a + b) + "</p>");
            out.println("</body>");
            out.println("</html>");  
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        // since there is nothing to be retrived from server so there is no need to modify this method
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        // since thereis nothing to be send to the server so there is no need to modify this method
    }

    @Override
    public String getServletInfo() {
        return "This servlet performs addition operations.";
    }
}

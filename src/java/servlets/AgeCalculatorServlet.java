package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/newjspagecalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int userage;
        String input = request.getParameter("age");
        String responsemessage = "Your Age Next Birthday Will Be: ";

        try {
            if (input == null || input.equals("")) {
                responsemessage = "Please Enter The Age As A Number !, Don't Leave It Empty.";
                request.setAttribute("message", responsemessage);

                getServletContext().getRequestDispatcher("/WEB-INF/newjspagecalculator.jsp").forward(request, response);
                return;
            }

            userage = Integer.parseInt(input);
            userage++;

            request.setAttribute("nextage", userage);
            request.setAttribute("message", responsemessage);

        } catch (Exception e) {
            responsemessage = "Invalid Input";
            request.setAttribute("message", responsemessage);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/newjspagecalculator.jsp").forward(request, response);

    }

}

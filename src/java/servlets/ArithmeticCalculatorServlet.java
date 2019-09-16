package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int first, second;
        String message = "Invalid";
        int result;

        try {
        String firstinput = request.getParameter("first");
        String secondinput = request.getParameter("second");

        try {
            if (firstinput == null || firstinput.equals("") || secondinput == null || secondinput.equals("")) {
                request.setAttribute("finalresult", message);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
        } catch (Exception e) {
            request.setAttribute("finalresult", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        first = Integer.parseInt(firstinput);
        second = Integer.parseInt(secondinput);

        String choice = request.getParameter("btn");

        
            if (choice.equals("+")) {
                result = first + second;
                message = Integer.toString(result);
                request.setAttribute("finalresult", message);
            } else if (choice.equals("-")) {
                result = first - second;
                message = Integer.toString(result);
                request.setAttribute("finalresult", message);
            } else if (choice.equals("*")) {
                result = first * second;
                message = Integer.toString(result);
                request.setAttribute("finalresult", message);
            } else if (choice.equals("/")) {
                result = first / second;
                message = Integer.toString(result);
                request.setAttribute("finalresult", message);
            }
        } catch (Exception e) {
            request.setAttribute("finalresult", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}

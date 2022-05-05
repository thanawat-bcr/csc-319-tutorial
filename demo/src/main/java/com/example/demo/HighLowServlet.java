package com.example.demo;

import com.example.demo.HiLow;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HighLowServlet", value = "/HighLowServlet")
public class HighLowServlet extends HttpServlet {

    // GET only one param as a number
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            String guessNumber = request.getParameter("number");
            int n = Integer.parseInt(guessNumber);

            HiLow h1 = new HiLow();
            String msg = "";
            if (n == h1.getDiceFace()) {
                msg = "Congratulation, you win this game";
            } else {
                msg = "Sorry, you loss";
            }
            out.println(msg);
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

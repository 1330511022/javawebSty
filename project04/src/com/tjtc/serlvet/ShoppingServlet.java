package com.tjtc.serlvet;

import com.tjtc.DB.JdbcTool;
import com.tjtc.products.Products;
import com.tjtc.products.PurchaseRecord;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShoppingServlet", value = "/Shopping")
public class ShoppingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        Object loginPhone = request.getSession().getAttribute("loginPhone");
        //Java EE企业级应用开发教程(buy1)
        int parameter1 = 0;
        if (request.getParameter("buy1") != null) {
            Products products = new Products();
            products.setPrductName("Java EE企业级应用开发教程");
            products.setPrductPrice(38);
            parameter1 = Integer.parseInt(request.getParameter("buy1"));
        }
        System.out.println(parameter1);
        //Vue.js前端开发实战(buy2)
        int parameter2 = 0;
        if (request.getParameter("buy2") != null) {
            Products products = new Products();
            products.setPrductName("Vue.js前端开发实战");
            products.setPrductPrice(40);
            parameter2 = Integer.parseInt(request.getParameter("buy2"));
        }
        System.out.println(parameter2);

        //Linux编程基础(buy3)
        int parameter3 = 0;
        if (request.getParameter("buy3") != null) {
            Products products = new Products();
            products.setPrductName("Linux编程基础");
            products.setPrductPrice(30);
            parameter3 = Integer.parseInt(request.getParameter("buy3"));
        }
        System.out.println(parameter3);

        //JavaWeb程序设计任务教程(buy4)
        int parameter4 = 0;
        if (request.getParameter("buy4") != null) {
            Products products = new Products();
            products.setPrductName("JavaWeb程序设计任务教程");
            products.setPrductPrice(44);
            parameter4 = Integer.parseInt(request.getParameter("buy4"));
        }
        System.out.println(parameter4);

        //算法导论第三版(buy5)
        int parameter5 = 0;
        if (request.getParameter("buy5") != null) {
            Products products = new Products();
            products.setPrductName("算法导论第三版");
            products.setPrductPrice(25);
            parameter5 = Integer.parseInt(request.getParameter("buy5"));
        }
        System.out.println(parameter5);

        //计算机组成原理（第3版）(buy6)
        int parameter6 = 0;
        if (request.getParameter("buy6") != null) {
            Products products = new Products();
            products.setPrductName("计算机组成原理（第3版）");
            products.setPrductPrice(19);
            parameter6 = Integer.parseInt(request.getParameter("buy6"));
        }
        System.out.println(parameter6);

        //操作系统教程-第5版(buy7)
        int parameter7 = 0;
        if (request.getParameter("buy7") != null) {
            Products products = new Products();
            products.setPrductName("操作系统教程-第5版");
            products.setPrductPrice(19);
            parameter7 = Integer.parseInt(request.getParameter("buy7"));
        }
        System.out.println(parameter7);

        //判断购买了哪件商品
        if (parameter1 == 1) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter1, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter2 == 2) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter2, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter3 == 3) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter3, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter4 == 4) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter4, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter5 == 5) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter5, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter6 == 6) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter6, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter7 == 7) {
            JdbcTool dbConnection = new JdbcTool();
            try {
                dbConnection.AddPurchases(parameter7, loginPhone);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        int userId = (int) request.getSession().getAttribute("id");
        List<PurchaseRecord> purchaseRecords = null;
        try {
            purchaseRecords = new JdbcTool().getPurchaseRecords(userId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("purchaseRecords", purchaseRecords);
        request.getRequestDispatcher("shopping.jsp").forward(request, response);
    }


        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

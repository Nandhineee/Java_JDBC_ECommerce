package com.javasql.controllers;

import com.javasql.dao.OrderDao;
import com.javasql.models.Order;
import com.javasql.utils.AppException;
import com.javasql.utils.StringUtil;
import com.javasql.views.AdminOrderPage;

import java.util.ArrayList;

import static com.javasql.utils.AppInput.enterInteger;
import static com.javasql.utils.AppOutput.println;

public class AdminOrderController {

    private final OrderDao orderDao;
    private final AdminOrderPage adminOrderPage;
    private final AdminController adminController;
    public AdminOrderController(AdminController adminController) {
        this.orderDao = new OrderDao();
        this.adminOrderPage = new AdminOrderPage();
        this.adminController= adminController;

    }

    private static ArrayList<Order> orders = new ArrayList<>();
    public void viewOrders() {
        orders=orderDao.getAllOrders();

        if(!orders.isEmpty())
        {
            adminOrderPage.viewOrders(orders);
            println(StringUtil.BACK);
            int choice;
            try {
                choice = enterInteger(StringUtil.CHOICE);
                if (choice == 100) {
                    adminController.printMenu();
                } else {
                    invalidException(new AppException(StringUtil.INVALID_CHOICE));
                }
            } catch (AppException e) {
                invalidException(e);
            }
        }
        else
        {
            println(StringUtil.ORDER_EMPTY_ADMIN);
            adminController.printMenu();
        }


    }
    private void invalidException(AppException e) {
        println(e.getMessage());
        viewOrders();
    }
}

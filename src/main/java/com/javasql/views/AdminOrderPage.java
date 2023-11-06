package com.javasql.views;

import com.javasql.models.Order;
import com.javasql.utils.StringUtil;

import java.util.ArrayList;

import static com.javasql.utils.AppOutput.println;

public class AdminOrderPage {
    public void viewOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        for (Order order : orders) {

            println(order.getId() + ". " + order.getProduct().getProductName() + ", "+"Ordered By: "+order.getUser().getEmail()+ ", " + order.getDate() + ", ₹." + order.getProduct().getPrice());

        }
    }
}

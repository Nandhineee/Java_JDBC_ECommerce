package com.javasql.views;

import com.javasql.models.Order;
import com.javasql.models.User;
import com.javasql.utils.StringUtil;

import java.util.ArrayList;

import static com.javasql.utils.AppOutput.println;
import static com.javasql.utils.UserUtil.getLoggedInUser;

public class OrderPage {
    public void printOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        User user = getLoggedInUser();
        for(Order order:orders)
        {
            if(order.getUser().getId()==user.getId())
            {
                println(order.getId()+". " + order.getProduct().getProductName() +", "+ order.getDate() +", ₹."+order.getProduct().getPrice());
            }
        }
    }
}

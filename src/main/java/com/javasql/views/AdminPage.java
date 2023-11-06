package com.javasql.views;

import com.javasql.utils.StringUtil;

import static com.javasql.utils.AppOutput.println;

public class AdminPage {
    public void welcomeMsg() {
        println(StringUtil.ADMIN_WELCOME);
    }

    public void adminMenu() {
        println(StringUtil.ADMIN_CHOICE);
    }
}

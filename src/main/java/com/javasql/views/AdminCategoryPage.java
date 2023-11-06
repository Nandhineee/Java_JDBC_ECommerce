package com.javasql.views;

import com.javasql.models.Category;
import com.javasql.utils.StringUtil;

import java.util.ArrayList;

import static com.javasql.utils.AppOutput.println;

public class AdminCategoryPage {


    public void categoryChoices() {
        println(StringUtil.CATEGORY_CHOICES);
    }

    public void printCategories(ArrayList<Category> categories) {
        println(StringUtil.CATEGORY_MESSAGE);
        for(Category data: categories)
        {
            println(data.getId()+". " + data.getCategoryName());
        }
    }
}

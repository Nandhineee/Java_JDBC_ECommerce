package com.javasql.views;

import com.javasql.models.Category;
import com.javasql.models.Product;
import com.javasql.utils.StringUtil;

import java.util.ArrayList;

import static com.javasql.utils.AppOutput.println;

public class ProductPage {
    public void printCategories(ArrayList<Category> categories) {
        println(StringUtil.CATEGORY_MESSAGE);
        for (Category category : categories){
            println(category.getId()+". " + category.getCategoryName());
        }
        println(StringUtil.BACK);
    }

    public void printCategoryProducts(int choice, ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {
            if (product.getCategory().getId() == choice) {
                println(product.getId() + ". " + product.getProductName()  + ", ₹." + product.getPrice());
            }
        }

    }

    public void printAllProducts(ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {

            println(product.getId() + ". " + product.getProductName() + ", ₹." + product.getPrice());

        }
    }
}

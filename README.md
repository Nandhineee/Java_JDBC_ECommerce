# Java_JDBC_ECommerce
This java console application for E-Commerce has the following sections:
------------------------------------------------------------------------
    👤 Login - Existing User and Admin
    👥 Register - New User
    🏠 Home - User
        👀 View Categories 
            🛍️ View products based on category.
            ⏬ Add products to cart.
        👀 View Products 
            ⏬ Add products to cart.
        🛒 View Cart 
            ✔️ Check out products from cart.
        ➡️ View Order 
            📦 Check for placed orders.
        📤 Logout
    🏠 Home - Admin 
        👀 View Categories 
            ➕ Add Category 
            ➖ Remove Category 
        👀 View Products 
            ➕ Add Product 
            🔄 Edit Product 
            ➖ Delete Product 
        👀 View Orders 
        📤 Logout
 
-> '💻-Java' for coding 
-> '🗃️-Database' for storing and retrieving data.
 
Tables used for each sections:
-----------------------------
    1. "🗃️-User table with Admin and User"  for storing user data.
    2. "🗃️-Category table" for storing categories.
    3. "🗃️-Product table" for storing Products.
    4. "🗃️-Cart table" for storing user cart details.
    5. "🗃️-Order table" for storing user order details.
 
 
Steps used and challenges faced to build this application:-
-----------------------------------------------------------
 
    Steps:
    ------
    👉 Used MVC (Model, View, Controller) architecture for developing the console application.
    👉 Added the required Models, Views and Controller along with Interface implementation to achieve abstraction.
    👉 Added user-defined exceptions to catch anf handle the exceptions.
    👉 Used encapsulation to hide data and used getter and setter for getting and setting the data for the models.
    👉 Used "ArrayList" to store and manipulate data according to the user preferrences.
    👉 Used "JDBC" and "Connection Path" to connect and access the database for storing and retriving the data.
    👉 Used Data Access Object (dao) for accessing Database using queries.
    👉 Stored the Connection path, Scanner class other sensitive information in a separate Utility folder.
    👉 Used Singleton pattern to avoid creating objects.
    👉 Used "Date" class for handling date for orders.
    👉 Handled exceptions for invalid choices.
 
    Challenges:
    -----------
    🔴 Faced "concurrentmodificationexception" - Caught this exception while working with Java collections.
        -> Solved it by not making any changes while the iterator is working on a ArrayList.
    🔴 Faced "StackOverFlow" - Caught this while creating parallel objects through constructor.
        -> Solved it by passing the instance "this" to other constructor.
    🔴 Had a problem for user object is null while trying to access the orders through admin page.
        -> Solved it by constructing the user Object.
 
 


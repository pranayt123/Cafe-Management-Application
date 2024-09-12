/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Supresh
 */
public class tables {

    public static void main(String arg[]) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','9922249463','India','admin','What is pet name','jimmy','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "CREATE TABLE product ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(200),"
                    + "category VARCHAR(200),"
                    + "price VARCHAR(200)"
                    + ")";
            String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
//            DBOperation.setDataOrDelete(userTable,"User Table Created successfully");
//            DBOperation.setDataOrDelete(adminDetails,"Admin Details Added Successfully");
//            DBOperation.setDataOrDelete(categoryTable,"Category Table Created Successfully");
//           DBOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DBOperation.setDataOrDelete(billTable, "Bill Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.Admin;
import java.sql.*;

/**
 *
 * @author Supresh
 */
public class UserDao {

    public static void save(Admin user) {
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobilenuber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','true')";
        DBOperation.setDataOrDelete(query, "Registered successfully! Wait For Admin Approval!");

    }

    public static Admin login(String email, String password) {
        Admin user = null;
        try {
            ResultSet rs = DBOperation.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new Admin();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static Admin getSecuritQuetion(String email) {
        Admin user = null;
        try {
            ResultSet rs = DBOperation.getData("select * from user where email ='" + email + "'");
            while (rs.next()) {
                user = new Admin();
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email='" + email + "'";
        DBOperation.setDataOrDelete(query, "Password Change Successfully");
    }
}

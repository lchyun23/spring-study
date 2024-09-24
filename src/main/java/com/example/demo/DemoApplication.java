package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {
    static void connect(String username, String password) {
        try {
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("- Database is connected successfully.");
            } else {
                throw new SQLException("데이터베이스 접속 실패");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace()[0]);
            System.out.println(e.getStackTrace()[1]);
        }
    }

    public static void main(String[] args) {
        connect("admin", "1234");
        connect("user", "9876");
    }
}

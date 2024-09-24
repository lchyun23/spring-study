package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@Slf4j
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
            log.error(String.format("데이터베이스 계정 불일치 - username: %s, password: %s", username, password));
        }
    }

    public static void main(String[] args) {
        connect("admin", "1234");
        connect("user", "9876");
    }
}

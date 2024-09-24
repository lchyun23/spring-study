package com.example.demo;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.PasswordException;
import com.example.demo.exception.UsernameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@Slf4j
@SpringBootApplication
public class DemoApplication {
    static void connect(String username, String password) {
        if (!StringUtils.hasLength(username)) {
            throw new UsernameException();
        }
        if (!StringUtils.hasLength(password)) {
            throw new PasswordException();
        }
        if (!(username.equals("admin") && password.equals("1234"))) {
            throw new DatabaseException();
        }
        if (true/* 강제로 예외를 발생시키기 위해 if (true) 추가 - 그렇지않으면 '아래부터 실행되지 않는데 코드가 있다'는 빌드 오류 */) {
            throw new RuntimeException("Cannot connect to the Database Server");
        }
        log.info("- Database is connected successfully.");
    }

    public static void main(String[] args) {
        try {
            connect(null, "9876");
            connect("user", null);
            connect("user", "9876");
            connect("admin", "1234");
        } catch (UsernameException e) {
            log.warn("유저가 존재하지 않는 아이디를 입력 중", e);
        } catch (PasswordException e) {
            log.warn("유저가 잘못된 비밀번호를 입력 중", e);
        } catch (DatabaseException e) {
            log.warn("잘못된 유저 정보로인한 데이터베이스 접속 실패", e);
        } catch (Exception e) {
            log.error("데이터베이스 내 알 수 없는 오류 발생 - 원인 분석 및 대응 필요", e);
        }
    }
}

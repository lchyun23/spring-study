package com.example.demo.controller.advice;

import com.example.demo.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice/* Controller 앞단에서 발생하는 에러를 캐치하기 위함 */
public class CustomExceptionHandler {

    /* 어떤 에러인지?를 명시하여 그에 해당하는 처리를 한다. */
    @ExceptionHandler// (value = {UserNotFoundException.class, NullPointerException.class})
    public ResponseEntity<ErrorDetail> handle(UserNotFoundException e) {
        log.warn("[WARN] " + e.getMessage(), e);
        return ResponseEntity
                .status(HttpStatusCode.valueOf(404))
                .body(ErrorDetail.of(ErrorDetailType.A04));
    }

    @ExceptionHandler/* 어떤 에러인지?를 명시하여 그에 해당하는 처리를 한다. */
    public ResponseEntity<ErrorDetail> handle(/* RuntimeException */Exception e) {
        log.error("[ERROR] " + e.getMessage(), e);
        return ResponseEntity
                .status(HttpStatusCode.valueOf(500))
                .body(ErrorDetail.of(ErrorDetailType.Z10));
    }
}

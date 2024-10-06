package com.example.demo.controller.advice;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorDetail {
    private String type;
    private String desc;

    public static ErrorDetail of(ErrorDetailType type) {
        return new ErrorDetail(type.name(), type.getDesc());
    }
}

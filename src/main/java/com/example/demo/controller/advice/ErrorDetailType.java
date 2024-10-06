package com.example.demo.controller.advice;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum ErrorDetailType {
    A04("유저가 데이터베이스 내 존재하지 않습니다."),
    A05("결제 데이터가 데이터베이스 내 존재하지 않습니다."),
    A06("상태가 데이터베이스 내 존재하지 않습니다."),
    Z10("내부에서 에러가 발생했습니다.");

    String desc;
}

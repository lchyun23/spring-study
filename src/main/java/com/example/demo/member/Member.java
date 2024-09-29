package com.example.demo.member;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class Member {
    private final Integer id;
    private final String name;
    private int age;
    private String email;
}

package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    /* private */ Integer id;
    /* private */ String name;
    /* private */ int age;
    /* private */ String email;
}

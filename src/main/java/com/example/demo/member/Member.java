package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Member {
    /* private final */ Integer id;
    /* private final */ String name;
    /* private final */ int age;
    /* private final */ String email;
}

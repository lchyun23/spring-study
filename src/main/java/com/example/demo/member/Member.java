package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@Value
@NonFinal                                                           // 상속(extends)을 위해서는 @NonFinal 통해 class 에게 자유를
// @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)    // @Value 는 각 필드에 대한 본 어노테이션을 내재한다.
public class Member {
    /* private final */ Integer id;
    /* private final */ String name;
    /* private final */ int age;
    /* private final */ String email;
}

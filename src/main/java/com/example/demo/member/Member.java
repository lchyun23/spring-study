package com.example.demo.member;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class Member {
    protected Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
    @Builder.Default
    protected String name = "Unnamed";
    protected int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
    @Builder.Default
    protected String email = "Undefined";
    @Singular
    protected List<String> favorites;

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s, favorites=%s)", id, name, age, email, favorites);
    }

    public String getName() {
        return this.name;
    }
}

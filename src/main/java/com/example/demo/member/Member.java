package com.example.demo.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public final String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", this.id, this.name, this.age, this.email);
    }
}

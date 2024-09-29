package com.example.demo.member;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    @ToString.Exclude
    private int age;
    @Setter
    @ToString.Exclude
    private String email;

//  public Member(Integer id, String name, int age, String email) {
//      this.id = id;
//      this.name = name;
//      this.age = age;
//      this.email = email;
//  }
}

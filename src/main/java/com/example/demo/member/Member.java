package com.example.demo.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;

//  public Member(Integer id, String name, int age, String email) {
//      this.id = id;
//      this.name = name;
//      this.age = age;
//      this.email = email;
//  }
}

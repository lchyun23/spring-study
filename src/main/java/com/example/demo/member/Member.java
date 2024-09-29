package com.example.demo.member;

import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    private int age;
    private String email;

//  public Member() {
//  }
}

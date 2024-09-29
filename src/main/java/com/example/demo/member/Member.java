package com.example.demo.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")
    private final Integer id;
    @ToString.Include(rank = -1)
    private final String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;

//  public Member(Integer id, String name) {
//      this.id = id;
//      this.name = name;
//  }
}

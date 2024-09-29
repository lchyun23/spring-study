package com.example.demo.member;

import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    @EqualsAndHashCode.Exclude
    private int age;
    @EqualsAndHashCode.Exclude
    private String email;

//  public boolean equals(Member member) {
//      return this.hashCode() == member.hashCode();
//  }
//
//  public int hashCode() {
//      int hash = 7;
//      hash = 31 * hash + (id == null ? 0 : id.hashCode());
//      hash = 31 * hash + (name == null ? 0 : name.hashCode());
//      hash = 31 * hash + (int) age;
//      hash = 31 * hash + (email == null ? 0 : email.hashCode());
//      return hash;
//  }
}

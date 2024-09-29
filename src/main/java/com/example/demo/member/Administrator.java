package com.example.demo.member;

import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
public class Administrator extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Administrator(String role) {
        super();
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

//  public String toString() {
//      return String.format(
//              "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
//              this.getId(), this.getName(), this.getAge(), this.getEmail(), this.role, this.allocatedAt
//      );
//  }
}

package com.example.demo.member;

import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
public class Administrator extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Administrator(Integer id, String name, String role) {
        super(id, name);
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

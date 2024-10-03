package com.example.demo.type;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum SendMediaType {
    SMS("010-0000-0000"),
    EMAIL("aaron@example.com");

    String sender;
}

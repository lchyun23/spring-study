package com.example.demo.principles;

import com.example.demo.principles.concretes.Noodle;
import com.example.demo.principles.interfaces.Egg;
import com.example.demo.principles.interfaces.Onion;
import com.example.demo.principles.interfaces.Soup;
import com.example.demo.principles.concretes.Water;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Ramen {
    private final Water water;
    private final Soup soup;
    private final Onion onion;
    private final Egg egg;
    private final Noodle noodle;

    public void make() {
        water.input();
        soup.input();
        onion.input();
        egg.input();
        noodle.input();
    }
}

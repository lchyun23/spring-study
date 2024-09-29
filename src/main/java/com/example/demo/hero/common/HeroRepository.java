package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> extends HeroCreateRepository<T, F>, HeroReadRepository<T, F>, HeroDeleteRepository<T, F> {
}

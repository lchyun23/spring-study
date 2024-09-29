package com.example.demo;

import com.example.demo.hero.*;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        StrengthHeroRepository strengthHeroRepository = new StrengthHeroRepository();
        strengthHeroRepository.save(new StrengthHero("Dragon Knight"));
        strengthHeroRepository.save(new StrengthHero("Pudge"));
        strengthHeroRepository.save(new StrengthHero("Slardar"));
        strengthHeroRepository.delete("Pudge");

        AgilityHeroRepository agilityRepository = new AgilityHeroRepository();
        agilityRepository.save(new AgilityHero("Weaver"));
        agilityRepository.save(new AgilityHero("Slark"));
        agilityRepository.save(new AgilityHero("Juggernaut"));
        agilityRepository.delete("Weaver");

        IntelligenceHeroRepository intelligenceRepository = new IntelligenceHeroRepository();
        intelligenceRepository.save(new IntelligenceHero("Puck"));
        intelligenceRepository.save(new IntelligenceHero("Crystal Maiden"));
        intelligenceRepository.save(new IntelligenceHero("Zeus"));
        intelligenceRepository.delete("Puck");

//      Hero strength         = strengthHeroRepository.findById("Slardar");
        StrengthHero strength = strengthHeroRepository.findById("Slardar");
//      Hero agility        = agilityRepository.findById("Slark");
        AgilityHero agility = agilityRepository.findById("Slark");
//      Hero intelligence             = intelligenceRepository.findById("Zeus");
        IntelligenceHero intelligence = intelligenceRepository.findById("Zeus");

        System.out.println("- 🟥 힘 속성 영웅");
        strength.getName();     // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        strength.attack();
        strength.ultimate();
        strength.berserk();     // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능

        System.out.println("- 🟩 민첩 속성 영웅");
        agility.getName();      // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        intelligence.getName(); // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        intelligence.attack();
        intelligence.ultimate();
    }
}

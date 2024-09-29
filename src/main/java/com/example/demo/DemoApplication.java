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

        Hero strength = strengthHeroRepository.findById("Slardar");
        Hero agility = agilityRepository.findById("Slark");
        Hero intelligence = intelligenceRepository.findById("Zeus");

        System.out.println("- 🟥 힘 속성 영웅");
//      strength.getName();     // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)
        strength.attack();
        strength.ultimate();
//      strength.berserk();     // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)

        System.out.println("- 🟩 민첩 속성 영웅");
//      agility.getName();      // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
//      intelligence.getName(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)
        intelligence.attack();
        intelligence.ultimate();
    }
}

package com.example.demo;

import com.example.demo.hero.*;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        StrengthHeroRepository strengthHeroRepository = new StrengthHeroRepository();
        AgilityHeroRepository agilityRepository = new AgilityHeroRepository();
        IntelligenceHeroRepository intelligenceRepository = new IntelligenceHeroRepository();

        Hero strength = strengthHeroRepository.findById(1);
        Hero agility = agilityRepository.findById(2);
        Hero intelligence = intelligenceRepository.findById(3);

        Map<String, Hero> hero_map = new HashMap<>();
        hero_map.put("🟥", strength);
        hero_map.put("🟩", agility);
        hero_map.put("🟦", intelligence);

        System.out.println("-- Map<String, Hero> hero_map --");
        System.out.println("- 🟥 힘 속성 영웅");
        hero_map.get("🟥").attack();
        hero_map.get("🟥").ultimate();
//      strength.berserk(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)

        System.out.println("- 🟩 민첩 속성 영웅");
        hero_map.get("🟩").attack();
        hero_map.get("🟩").ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        hero_map.get("🟦").attack();
        hero_map.get("🟦").ultimate();
    }
}

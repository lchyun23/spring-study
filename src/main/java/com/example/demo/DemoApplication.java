package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        Hero strength = new StrengthHero();
        Hero agility = new AgilityHero();
        Hero intelligence = new IntelligenceHero();

        System.out.println("- 🟥 힘 속성 영웅");
        strength.attack();
        strength.ultimate();
//      strength.berserk(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)

        System.out.println("- 🟩 민첩 속성 영웅");
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        intelligence.attack();
        intelligence.ultimate();

        /* Collection 1) Array 배열 */
//      String[] string_array = new String[3];                      // 길이 기반 Array 선언 (String 요소)
//      String[] string_array = new String[]{"1", "2", "3"};        // 값 기반 Array 선언 (String 요소)
//      System.out.println(string_array.length);
//      Integer[] integer_array = new Integer[3];                   // 길이 기반 Array 선언 (Integer 요소)
//      Integer[] integer_array = new Integer[]{1, 2, 3};           // 값 기반 Array 선언 (Integer 요소)
//      System.out.println(integer_array.length);

        /* Collection 2) List 리스트 */
//      List<String> string_list = new ArrayList<>();               // 빈 List 선언 (String 요소)
//      string_list.add("1");
//      string_list.add("2");
//      string_list.add("3");
        List<String> string_list = Arrays.asList("1", "2", "3");    // 값 기반 List 선언 (String 요소)
        string_list.get(3);                         // 조회
        string_list.add("4");                       // 추가
        string_list.set(3, "5");                    // 수정
        string_list.remove(3);                      // 삭제
        string_list.subList(0, 1);                  // 부분
        string_list.sort(String::compareTo);        // 나열
        string_list.contains("1");                  // 포함
        string_list.clear();                        // 리셋
        string_list.isEmpty();                      // 검사
        string_list.size();                         // 개수
//      List<Integer> integer_list = new ArrayList<>();             // 빈 List 선언 (Integer 요소)
//      integer_list.add(1);
//      integer_list.add(2);
//      integer_list.add(3);
        List<Integer> integer_list = Arrays.asList(1, 2, 3);        // 값 기반 List 선언 (Integer 요소)
        integer_list.get(3);                        // 조회
        integer_list.add(4);                        // 추가
        integer_list.set(3, 5);                     // 수정
        integer_list.remove(3);                     // 삭제
        integer_list.subList(0, 1);                 // 부분
        integer_list.sort(Integer::compareTo);      // 나열
        integer_list.contains(1);                   // 포함
        integer_list.clear();                       // 리셋
        integer_list.isEmpty();                     // 검사
        integer_list.size();                        // 개수

        System.out.println(string_list);
        System.out.println(integer_list);
    }
}

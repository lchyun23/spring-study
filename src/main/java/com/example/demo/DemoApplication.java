package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        Hero strength = new StrengthHero();
        Hero agility = new AgilityHero();
        Hero intelligence = new IntelligenceHero();

        Map<String, Hero> hero_map = new HashMap<>();
        hero_map.put("🟥", strength);
        hero_map.put("🟩", agility);
        hero_map.put("🟦", intelligence);

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
//      List<String> string_list = Arrays.asList("1", "2", "3");    // 값 기반 List 선언 (String 요소)
//      string_list.get(3);                         // 조회
//      string_list.add("4");                       // 추가
//      string_list.set(3, "5");                    // 수정
//      string_list.remove(3);                      // 삭제
//      string_list.subList(0, 1);                  // 부분
//      string_list.sort(String::compareTo);        // 나열
//      string_list.contains("1");                  // 포함
//      string_list.clear();                        // 리셋
//      string_list.isEmpty();                      // 검사
//      string_list.size();                         // 개수
//      List<Integer> integer_list = new ArrayList<>();             // 빈 List 선언 (Integer 요소)
//      integer_list.add(1);
//      integer_list.add(2);
//      integer_list.add(3);
//      List<Integer> integer_list = Arrays.asList(1, 2, 3);        // 값 기반 List 선언 (Integer 요소)
//      integer_list.get(3);                        // 조회
//      integer_list.add(4);                        // 추가
//      integer_list.set(3, 5);                     // 수정
//      integer_list.remove(3);                     // 삭제
//      integer_list.subList(0, 1);                 // 부분
//      integer_list.sort(Integer::compareTo);      // 나열
//      integer_list.contains(1);                   // 포함
//      integer_list.clear();                       // 리셋
//      integer_list.isEmpty();                     // 검사
//      integer_list.size();                        // 개수

        /* Collection 3) Set 세트 */
//      Set<String> string_set = new HashSet<>();                   // 빈 Set 선언 (String 요소)
//      string_set.add("1");
//      string_set.add("2");
//      string_set.add("3");
//      Set<String> string_set = new HashSet<>(Arrays.asList("1", "2", "3"));
//      string_set.add("4");                        // 추가
//      string_set.remove("1");                     // 삭제
//      string_set.contains("1");                   // 포함
//      string_set.clear();                         // 리셋
//      string_set.isEmpty();                       // 검사
//      string_set.size();                          // 개수
//      Set<Integer> integer_set = new HashSet<>();                 // 빈 Set 선언 (Integer 요소)
//      integer_set.add(1);
//      integer_set.add(2);
//      integer_set.add(3);
//      Set<Integer> integer_set = new HashSet<>(Arrays.asList(1, 2, 3));
//      integer_set.add(4);                         // 추가
//      integer_set.remove(3);                      // 삭제
//      integer_set.contains(1);                    // 포함
//      integer_set.clear();                        // 리셋
//      integer_set.isEmpty();                      // 검사
//      integer_set.size();                         // 개수

        /* Collection 4) Map 세트 */
//      Map<Integer, String> string_map = new HashMap<>();          // 빈 Map 선언 (String 요소)
//      string_map.put(1, "1");
//      string_map.put(2, "2");
//      string_map.put(3, "3");
        /* 주의 : Arrays.asList 와 Map.of 으로 생성되는 Collection 은 Immutable 불변성이기에 수정 불가 - get, put, remove 등 불가 */
//      Map<Integer, String> string_map = Map.of(1, "1", 2, "2", 3, "3");
//      string_map.get(3);                          // 조회
//      string_map.put(4, "4");                     // 추가
//      string_map.replace(4, "5");                 // 수정
//      string_map.remove(3);                       // 삭제
//      string_map.containsKey(1);                  // 포함
//      string_map.containsValue("1");              // 포함
//      string_map.entrySet();                      // - Entry = [Key, Value] (Set)
//      string_map.keySet();                        // - Key (Set)
//      string_map.values();                        // - Value (List)
//      string_map.clear();                         // 리셋
//      string_map.isEmpty();                       // 검사
//      string_map.size();                          // 개수
//      Map<Integer, Integer> integer_map = new HashMap<>();        // 빈 Map 선언 (Integer 요소)
//      integer_map.put(1, 1);
//      integer_map.put(2, 2);
//      integer_map.put(3, 3);
        /* 주의 : Arrays.asList 와 Map.of 으로 생성되는 Collection 은 Immutable 불변성이기에 수정 불가 - get, put, remove 등 불가 */
//      Map<Integer, Integer> integer_map = Map.of(1, 1, 2, 2, 3, 3);
//      integer_map.get(3);                         // 조회
//      integer_map.put(4, 4);                      // 추가
//      integer_map.replace(4, 5);                  // 수정
//      integer_map.remove(3);                      // 삭제
//      integer_map.containsKey(1);                 // 포함
//      integer_map.containsValue(1);               // 포함
//      integer_map.entrySet();                     // - Entry = [Key, Value] (Set)
//      integer_map.keySet();                       // - Key (Set)
//      integer_map.values();                       // - Value (List)
//      integer_map.clear();                        // 리셋
//      integer_map.isEmpty();                      // 검사
//      integer_map.size();                         // 개수
    }
}

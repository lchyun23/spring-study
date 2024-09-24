package com.example.demo.travel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TravelService {
    public void reservation() {
        Database connection = new Database(null, "9876");
//      Database connection = new Database("user", null);
//      Database connection = new Database("user", "9876");
//      Database connection = new Database("admin", "1234");

        connection.save("항공권");
        connection.save("리조트");
        connection.save("수영장");

        log.info("여행 패키지 예약 완료 (항공권 + 리조트 + 수영장)");
    }
}

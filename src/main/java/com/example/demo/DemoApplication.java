package com.example.demo;

import com.example.demo.travel.TravelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        TravelService service = new TravelService();
        service.reservation();
    }
}

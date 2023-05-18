package com.kbstar.cart;

import com.kbstar.service.CartService;
import com.kbstar.service.StudyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {

    @Autowired
    CartService service;
    @Test
    void contextLoads() {
        try {
            service.get(1002);
        } catch (Exception e) {
            log.info("select one error-----------------------------");
            e.printStackTrace();
        }
        }
    }

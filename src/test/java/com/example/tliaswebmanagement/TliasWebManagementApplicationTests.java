package com.example.tliaswebmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    public void testUuid() {
        for(int i = 0;i < 1000; i++){
            String s = UUID.randomUUID().toString();
            System.out.println(s);
        }
    }

}

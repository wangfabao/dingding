package com.ruantong.dingding.com.wfb;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class fbtest01 {

    @Test
    public void test5(){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        System.out.println(uuid);
    }
}

package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map map=new HashMap<>();
        map.put("Id","null");
        System.out.print("result :"+map.get("Id").toString());

    }
}

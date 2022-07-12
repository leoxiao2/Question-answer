package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chicken question：");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    if ((i + j + k == 100) && (5 * i + 3 * j + k / 3 == 100)) {
                        System.out.println("cock：" + i );
                        System.out.println("hen ：" + j );
                        System.out.println("chickens：" + k );
                        System.out.println("=======");
                    }
                }
            }
        }
        System.out.println("Transport question：");
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("car",500);
        hashMap.put("bus",300);
        hashMap.put("train",400);
        hashMap.put("plane",1000);
        for (String key : hashMap.keySet()) {
            if(hashMap.get(key)<=500)
            System.out.println("可以乘坐:" + key);
        }



    }
}




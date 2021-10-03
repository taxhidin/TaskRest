package com.example.demo;

import java.util.HashMap;

public class SummaryService {

    private Message message = new Message(1, 2, 3, 4, 5, 6, 7, 8);

    public HashMap<String, Integer> get_Test() {
        HashMap<String, Integer> map = new HashMap<>();

        int value = message.getFirst() + message.getSecond() + message.getThird() + message.getFourth() + message.getFive() +
                message.getSix() + message.getSeven() + message.getEight();

        map.put("result: ", value);


        return map;
    }

}

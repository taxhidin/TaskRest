package com.example.demo;

public class MessageService {

    Message message = new Message(1, 2, 3, 4, 5, 6, 7, 8);


    public int[] getAllMessages() {
        int[] test = new int[8];
        test[0] = message.getFirst();
        test[1] = message.getSecond();
        test[2] = message.getThird();
        test[3] = message.getFourth();
        test[4] = message.getFive();
        test[5] = message.getSix();
        test[6] = message.getSeven();
        test[7] = message.getEight();


        return test;

    }


}

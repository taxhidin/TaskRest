package com.example.demo;/*import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement*/

public class Message {


    private int first;
    private int second;
    private int third;
    private int fourth;
    private int five;
    private int six;
    private int seven;
    private int eight;

    public Message(int first, int second, int third, int fourth, int five, int six, int seven, int eight) {
        this.first = 1;
        this.second = 2;
        this.third = 3;
        this.fourth = 4;
        this.five = 5;
        this.six = 6;
        this.seven = 7;
        this.eight = 8;
    }

    public Message() {
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getSeven() {
        return seven;
    }

    public void setSeven(int seven) {
        this.seven = seven;
    }

    public int getEight() {
        return eight;
    }

    public void setEight(int eight) {
        this.eight = eight;
    }
}
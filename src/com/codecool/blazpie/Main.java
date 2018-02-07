package com.codecool.blazpie;

import java.time.LocalTime;
import java.util.List;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        int start = LocalTime.now().getNano();
        List<Integer> a = counter.count(1234245, 6);
        int duration = LocalTime.now().getNano() - start;

        System.out.println(a);
        System.out.println(duration);
    }
}

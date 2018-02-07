package com.codecool.blazpie;

import java.util.LinkedList;
import java.util.List;

public class Counter {

    public List<Integer> count (int n, int k) {

        List<Integer> in = makeList(n);
        List<Integer> out = new LinkedList<>();
        int start = 0;

        while (n > 0) {
            start = (start + k - 1) % n--;
            out.add(in.remove(start));
        }

        return out;
    }

    private List<Integer> makeList(int n) {

        List<Integer> result = new LinkedList<>();

        for (int i=0; i<n; i++) {
            result.add(i + 1);
        }

        return result;
    }
}

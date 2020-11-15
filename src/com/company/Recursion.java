package com.company;

import java.util.ArrayList;

class Recursion {
    private int num;
    public ArrayList<Integer> list = new ArrayList<>();

    public Recursion(int num) {
        this.num = num;
    }

    public String recursionArray() {
        if (this.num == 0) {
            System.out.println(list);
            return "";
        } else {
            list.add(0, this.num);
            this.num -= 1;
            return recursionArray();
        }
    }
}

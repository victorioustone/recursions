package com.company;

public class Branch {
//    класс, создающий ветку (ребенка)
    protected int key;
    protected Branch leftChild;
    protected Branch rightChild;

    public Branch(int key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}

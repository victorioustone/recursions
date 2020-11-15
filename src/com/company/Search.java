package com.company;

import java.util.ArrayList;

class Search {
    private int[] nums;
    private int k=1;
    private int left;
    private int right;
    private int middle;


    public Search(int[] nums) {
        this.nums = nums;
    }

//    перебор
    public String searchArray(int n) {
        if (this.nums.length-k == 0) {
            System.out.println("Введенное значение НЕ существует");
            return "";
        }
        else if (this.nums[this.nums.length-k] == n) {
            System.out.println("Введенное значение существует");
            return "";
        } else {
            k += 1;
            return searchArray(n);
        }
    }

// двоичный поиск
    public String setBSearch(int n){
        left = 0;
        right = this.nums.length-1;
        return bSearch(n);
    }

    private String bSearch(int n) {
        int root = right - (right - left) / 2;
        try {
            if (this.nums[root] == n) {
                System.out.println("Введенное значение существует");
                return "";
            }
            else if (this.nums[root] > n) {
                right = root;
                if (this.nums[right] < n){
                    throw new Exception();
                }
                return bSearch(n);
            }
            else{
                left = root + 1;
                if (this.nums[left] > n){
                    throw new Exception();
                }
                return bSearch(n);
            }
        } catch (Exception e){
            System.out.println("Введенное значение НЕ существует");
            return "";
        }

    }

}
package com.company;

import java.util.Random;

public class Array_r {
    private int [] nums;

//    создание массива
    public int [] createAList(){
//        nums = new int[100000000];
        nums = new int[10000];
        Random randomGenerator = new Random();

        for (int i = 0; i < nums.length; ++i){
            nums[i] = randomGenerator.nextInt(1000);
        }
        bubbleSort();
        return nums;
    }

//     сортировка пузырьком
    public void bubbleSort(){
        for(int i = nums.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( nums[j] > nums[j+1] ){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }

}

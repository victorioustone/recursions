package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        задание 1
        System.out.println("Задание 1");
        System.out.println("Введите значение >>> ");
        Scanner scan = new Scanner(System.in);
        int n_ = scan.nextInt();
        Recursion recursion = new Recursion(n_);
        recursion.recursionArray();

//        задание 2
        System.out.println();
        System.out.println("Задание 2");
        int[] nums = new int[] { 1, 2, 3, 5, 6, 7, 9 };
        System.out.println(Arrays.toString(nums));
        Search search = new Search(nums);
        System.out.println("Поиск числа: 2" );
        search.searchArray(2);
        System.out.println("Поиск числа: 12" );
        search.searchArray(12);
        System.out.println("Поиск числа: 8" );
        search.searchArray(8);
        System.out.println("Поиск числа: 4" );
        search.searchArray(4);
        System.out.println();

        System.out.println("*** БИНАРНЫЙ ПОИСК ***" );
        System.out.println("Поиск числа: 2" );
        search.setBSearch(2);
        System.out.println("Поиск числа: 12" );
        search.setBSearch(12);
        System.out.println("Поиск числа: 8" );
        search.setBSearch(8);
        System.out.println("Поиск числа: 4" );
        search.setBSearch(4);
        System.out.println();

        System.out.println("****** СРАВНЕНИЕ ******" );

        Array_r n = new Array_r();
        int [] numsss = n.createAList();
        Search search1 = new Search(numsss);
        System.out.println("Поиск числа: 404" );
        long begin = System.nanoTime();
        search1.searchArray(404);
        long nanotimes = System.nanoTime() - begin;
        System.out.println("Время: " + nanotimes );
        System.out.println();

        System.out.println("*** БИНАРНЫЙ ПОИСК ***" );
        System.out.println("Поиск числа: 404" );
        long begin1 = System.nanoTime();
        search1.setBSearch(404);
        long nanotimes1 = System.nanoTime() - begin1;
        System.out.println("Время: " + nanotimes1 );
        System.out.println();

//        задание 3
        System.out.println("Задание 3");
        Solution sol = new Solution();
        System.out.println("Решение -> "+Arrays.toString(sol.solution()));
        System.out.println();


//        задание 4
        System.out.println("Задание 4");
        BinaryTree tree = new BinaryTree(5);
        tree.insertChild(tree,3);
        tree.insertChild(tree,8);
        tree.insertChild(tree,1);
        tree.insertChild(tree,2);
        tree.insertChild(tree,7);
        tree.insertChild(tree,9);

        tree.print(tree);
        System.out.println();

        tree.existValue(tree,3);
        tree.existValue(tree,11);

        tree.remove(tree,1);
        tree.print(tree);
        System.out.println();
        tree.remove(tree,7);
        tree.print(tree);
        System.out.println();
        tree.existValue(tree,9);
        tree.existValue(tree,8);
    }

}

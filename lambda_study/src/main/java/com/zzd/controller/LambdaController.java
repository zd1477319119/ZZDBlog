package com.zzd.controller;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/25 7:43
 * @Version 1.0
 */
public class LambdaController {
    public static void main(String[] args) {
//        new Thread(()->{
//                System.out.println("新线程中rn方法被执行了");
//            }).start();

//        int i = calculation((left, right) -> left + right);

        printNum(value -> value%2==0);
    }

    public static void printNum(IntPredicate intPredicate) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i: arr) {
            if (intPredicate.test(i))
                System.out.println(i);
        }
    }

    public static int calculation(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}

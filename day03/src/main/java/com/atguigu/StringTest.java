package com.atguigu;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * String的测试类
 */
public class StringTest {

    @Test
    public void test01() {

        /**
         * 1、常量与常量的拼接结果在常量池，且常量池中不会存在相同内容的结果
         * 2、只要其中一个是变量，结果就在堆中
         * 3、如果拼接的结果调用intern()方法，返回值就在常量池
         */
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
        System.out.println(s3 == s6);//true

    }

    @Test
    public void test02() {

        /**
         * String 与byte数组的转换
         * String -> byte[] String的getBytes()
         * byte[] -> String String的new String(byte[])
         *
         */
        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        String s2 = new String(bytes);
        System.out.println(s2);

    }
}

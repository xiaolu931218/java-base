package com.atguigu;

import org.junit.jupiter.api.Test;

/**
 * String的测试类
 */
public class StringTest {

    @Test
    public void test01() {
        final int a=1;
        final int b =2;
        int c = a+b;
        System.out.println(a);
        System.out.println(c);

        final String s1 = "a";
        final String s2 = "a";
        String s3 = s1 + s2;

    }
}

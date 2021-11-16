package com.niuer.setdome;

import java.util.ArrayList;
import java.util.Collections;

//【作业1：】实现ArrayList的两种排序方式
//        提示：
//        商品对象类：Goods（String name, double price）
//        创建对象并添加到ArrayList中
//        Collections.Sort();
//        要求：动态选择排序的方式。
public class SetDome {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(new Goods("东鹏",12));
        array.add(new Goods("启力",4.3));
        array.add(new Goods("红牛",5));
        array.add(new Goods("脉动",4));

//        Collections.sort(array);
//
//        array.forEach(System.out::println);

        Collections.sort(array,new MyCollections());
        array.forEach(System.out::println);

    }
}

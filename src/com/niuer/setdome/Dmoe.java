package com.niuer.setdome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//1、设计一个程序，在一个ArrayList中存储10个不同的正整数，并按由大到小的次序输出这10个正整数的值。
//2、设计一个程序，在一个LinkedList中存储10个不同的正整数，并求出这10个正整数的最大值和最小值。
//3、设计一个程序，将数组
//   String animals[]={“Cat”,”Dog”,”Pig”,”Monkey”,”Mouse”,”Pig”,”Horse”}
//   中的元素存储在一个ArrayList中，并使用迭代对其进行遍历。
public class Dmoe {
    public static void main(String[] args) {
         ArrayList a = new ArrayList();
         a.add(23);
         a.add(321);
         a.add(233);
         a.add(21);
         a.add(121);
         a.add(1);
         a.add(44);
         a.add(55);

        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("最大值："+Collections.max(a));
        System.out.println("最小值："+Collections.min(a));

        a.forEach(System.out::println);
        String animals[]={"Cat","Dog","Pig","Monkey","Mouse","Pig","Horse"};
        ArrayList a1 = new ArrayList();
        HashSet h = new HashSet();
        for (int i = 0; i <animals.length ; i++) {
            a1.add(animals[i]);
            h.add(animals[i]);
        }


       h.forEach(System.out::println);

        Iterator it = a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}

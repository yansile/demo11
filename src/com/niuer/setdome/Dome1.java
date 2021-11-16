package com.niuer.setdome;

import java.util.*;

//统计不重复的字符的个数并显示。
public class Dome1 {
    public static void main(String[] args) {
        System.out.println("输入");
        String str = new Scanner(System.in).nextLine();
        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        for( char c : arr){
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }
        }


        Set<Character> set = map.keySet();
        Iterator<Character> it = set.iterator();

        while (it.hasNext()){
            Character key = it.next();
            System.out.println(key+""+map.get(key));
        }
    }
}

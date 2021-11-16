package com.niuer.setdome;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RoomTest {
    public static void main(String[] args) {
        Map<Integer,Room> hs = new HashMap<Integer, Room>();
        Room r = new Room(1,"标准间",23);

        hs.put(r.getRid(),r);
        Collection<Room> values = hs.values();
        values.forEach(System.out::println);

//        hs.add(new Room(1,"标准间",23));
//        hs.add(new Room(2,"标准间",23));
//        hs.add(new Room(3,"豪华间",55));
//        hs.add(new Room(4,"超级豪华间",99));
//
//        hs.forEach(System.out::println);


    }
}

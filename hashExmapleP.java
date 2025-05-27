package com.practise;

import java.util.HashMap;
import java.util.HashSet;

public class hashExmapleP {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("suraj",99);
        map.put("raj",90);
        System.out.println("marks of suraj:"+map.get("suraj"));
        map.remove("raj");
        System.out.println("contains key "+map.containsKey("suraj"));

        HashSet<String>set=new HashSet<>();
        set.add("mumbai");
        set.add("odisha");
     

    }
}

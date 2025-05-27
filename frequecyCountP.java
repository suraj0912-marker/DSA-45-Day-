
package com.practise;

import java.util.HashMap;
import java.util.Map;

public  class frequecyCountP {
    public static void main(String[] args) {
        int []arr={1,2,2,3};
        Map<Integer,Integer>map=new HashMap<>();
        for (int num:arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (Integer key: map.keySet()){
            System.out.println(key+"->"+ map.get(key));
        }

    }
}
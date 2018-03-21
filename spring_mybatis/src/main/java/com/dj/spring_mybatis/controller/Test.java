package com.dj.spring_mybatis.controller;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String a = "Every year , women ’s day reminds people the importance of women , and men should respect them . While as the society develops , some people complain that the meaning of this day has been mislead . It has been always advocated that men and women should be equal .";
        String[] b = a.split(" ");
        Map <String,Integer> map = new HashMap();
        for (int i = 0 ; i<b.length ; i++){
            String l = b[i];
            Integer s = 0;
            for (int j = 0 ; j<b.length ; j++){
                if (l.equals(b[j])){
                    s++;
                }
            }
            map.put(l,s);

        }
        for (Map.Entry<String , Integer> o:map.entrySet() ){
            System.out.println(o.getKey()+";"+o.getValue());
        }
    }
}

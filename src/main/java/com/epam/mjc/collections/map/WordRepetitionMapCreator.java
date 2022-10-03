package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> ans = new HashMap<>();

        String[] words = sentence.split("[ ,.:!?();]");

        for (String value:
             words) {
            if(value.equals("")) continue;
            Integer x = ans.get(value.toLowerCase(Locale.ROOT));
            if(x==null) {
                x=0;
            }
            ans.put(value.toLowerCase(Locale.ROOT), x+1);

        }
        return ans;
    }
}

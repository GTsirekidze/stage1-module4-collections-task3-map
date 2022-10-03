package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
            return functionMap.get(requiredValue)!=null;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> funcMap = new HashMap<>();
        for (Integer value:
             sourceList) {
            funcMap.put(value*5+2,value);
        }
        return funcMap;
    }
}

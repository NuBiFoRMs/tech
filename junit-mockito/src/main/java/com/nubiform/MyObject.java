package com.nubiform;

import java.util.ArrayList;
import java.util.List;

public class MyObject {

    public boolean getTrueOrFalseValue(int value) {
        System.out.println("getTrueOrFalse");
        return true;
    }

    public int getIntValue(int value) {
        System.out.println("getIntValue");
        return value;
    }

    public List<Integer> getListObject(int value) {
        System.out.println("getListObject");

        List<Integer> result = new ArrayList<>();
        result.add(value);

        return result;
    }

    public Object getObject (int value) {
        return new Object();
    }
}

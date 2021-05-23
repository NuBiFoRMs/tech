package com.nubiform;

import com.sun.tools.javac.util.List;

import java.util.Collections;

public class MyObject {

    public boolean getTrueOrFalseValue(int value) {
        System.out.println("getTrueOrFalse");
        return true;
    }

    public int getIntValue(int value) {
        System.out.println("getIntValue");
        return value;
    }

    public List getListObject(int value) {
        System.out.println("getListObject");
        return List.of(value);
    }

    public Object getObject (int value) {
        return new Object();
    }
}

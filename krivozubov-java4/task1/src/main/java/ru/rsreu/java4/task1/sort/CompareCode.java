package ru.rsreu.java4.task1.sort;

import ru.rsreu.java4.task1.essence.MyObject;

import java.util.Comparator;

public class CompareCode implements Comparator<MyObject> {

    @Override
    public int compare(MyObject o1, MyObject o2) {
        return o1.getCode() - o2.getCode();
    }
}

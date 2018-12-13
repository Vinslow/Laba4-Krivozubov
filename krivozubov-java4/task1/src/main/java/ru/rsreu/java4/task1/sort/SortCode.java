package ru.rsreu.java4.task1.sort;

import ru.rsreu.java4.task1.essence.ListService;

import java.util.Collections;

public class SortCode {

    private ListService listMyObject;

    public SortCode(ListService listMyObject) {
        this.listMyObject = listMyObject;
    }

    public void sort() {
        Collections.sort(listMyObject.getMyObjectList(), new CompareCode());
    }
}

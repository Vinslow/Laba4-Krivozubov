package ru.rsreu.java4.task1.essence;

import ru.rsreu.java4.task1.search.Searcher;

import java.util.List;


public class ListMyObject implements ListService {

    private Searcher searcher;
    private List<MyObject> myObjectList;

    public ListMyObject(Searcher searcher) {
        this.searcher = searcher;
        init();
    }

    public List<MyObject> getMyObjectList() {
        return myObjectList;
    }

    public void setMyObjectList(List<MyObject> myObjectList) {
        this.myObjectList = myObjectList;
    }

    public void init() {
        searcher.search();
        myObjectList = searcher.getSearch();
    }
}

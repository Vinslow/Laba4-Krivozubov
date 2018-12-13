package ru.rsreu.java4.task2.board;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneralBoard implements BoardService {

    private Map<Straight, Set<Point>> hashMap;

    public GeneralBoard() {
        hashMap = new HashMap<>();
    }

    public Map<Straight, Set<Point>> getHashMap() {
        return hashMap;
    }

    public void add(Straight straight, Set<Point> pointSet) {
        hashMap.put(straight, pointSet);
    }
}

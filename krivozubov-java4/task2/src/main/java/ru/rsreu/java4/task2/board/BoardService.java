package ru.rsreu.java4.task2.board;

import java.util.Map;
import java.util.Set;

public interface BoardService {

    Map<Straight, Set<Point>> getHashMap();

    void add(Straight straight, Set<Point> pointSet);

}

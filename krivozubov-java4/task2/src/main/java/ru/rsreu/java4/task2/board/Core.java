package ru.rsreu.java4.task2.board;

import ru.rsreu.java4.task2.reader.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Core {

    private BoardService boardService;
    private List<Point> pointList;
    private Reader reader;

    public Core(BoardService boardService, Reader reader) {
        this.boardService = boardService;
        this.reader = reader;
    }

    public void work() {
        reader.read();
        pointList = new ArrayList<>(reader.getPointSet());
        for (int i = 0; i < pointList.size() - 1; i++) {
            for (int j = i + 1; j < pointList.size(); j++) {
                if (check(pointList.get(i), pointList.get(j))) {
                    boardService.add(new Straight(pointList.get(i), pointList.get(j)), new HashSet<>(Arrays.asList(pointList.get(i), pointList.get(j))));
                } else {
                    boardService.getHashMap().get(serach(pointList.get(i))).add(pointList.get(i));
                    boardService.getHashMap().get(serach(pointList.get(j))).add(pointList.get(j));
                }
            }
        }
    }

    private boolean check(Point point, Point point2) {
        for (Straight stra : boardService.getHashMap().keySet()) {
            if (stra.affiliation(point) && stra.affiliation(point2)) {
                return false;
            }
        }
        return true;
    }

    private Straight serach(Point point) {
        for (Straight stra : boardService.getHashMap().keySet()) {
            if (stra.affiliation(point)) {
                return stra;
            }
        }
        return null;
    }
}

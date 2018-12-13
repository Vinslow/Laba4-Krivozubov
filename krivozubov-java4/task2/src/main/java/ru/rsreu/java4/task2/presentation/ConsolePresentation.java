package ru.rsreu.java4.task2.presentation;

import ru.rsreu.java4.task2.board.BoardService;
import ru.rsreu.java4.task2.board.Point;
import ru.rsreu.java4.task2.board.Straight;

public class ConsolePresentation implements Presentation {
    private BoardService boardService;

    public ConsolePresentation(BoardService boardService) {
        this.boardService = boardService;
    }

    @Override
    public void show() {
        for (Straight straight : boardService.getHashMap().keySet()) {
            System.out.println(straight.toString());
            for (Point point : boardService.getHashMap().get(straight)) {
                System.out.println(point.toString());
            }
            System.out.println("\n====================\n");
        }
    }
}

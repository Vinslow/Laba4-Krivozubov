package ru.rsreu.java4.task2.presentation;

import ru.rsreu.java4.task2.board.BoardService;
import ru.rsreu.java4.task2.board.Straight;

import java.io.FileWriter;
import java.io.IOException;


public class FilePresentation implements Presentation {

    private BoardService boardService;

    public FilePresentation(BoardService boardService) {
        this.boardService = boardService;
    }

    @Override
    public void show() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Straight straight : boardService.getHashMap().keySet()) {
            stringBuffer.append(straight.toString() + " (" + boardService.getHashMap().get(straight).size() + ")\n");
        }
        try (FileWriter writer = new FileWriter("/Users/upagge/IdeaProjects/Epam/java4/task2/src/main/resources/text/output.txt", false)) {
            writer.write(stringBuffer.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

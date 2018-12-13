package ru.rsreu.java4.task2;

import ru.rsreu.java4.task2.board.BoardService;
import ru.rsreu.java4.task2.board.Core;
import ru.rsreu.java4.task2.board.GeneralBoard;
import ru.rsreu.java4.task2.controller.Controller;
import ru.rsreu.java4.task2.controller.GeneralController;
import ru.rsreu.java4.task2.presentation.ConsolePresentation;
import ru.rsreu.java4.task2.presentation.Presentation;
import ru.rsreu.java4.task2.reader.Reader;
import ru.rsreu.java4.task2.reader.ReaderConsole;

public class Starter {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.run();
    }

    public void run() {
        BoardService boardService = new GeneralBoard();
        Reader reader = new ReaderConsole();
        Core core = new Core(boardService, reader);
//        Presentation presentation = new FilePresentation(boardService);
        Presentation presentation = new ConsolePresentation(boardService);

        Controller controller = new GeneralController(core, presentation);
        controller.run();
    }
}
